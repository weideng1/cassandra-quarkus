/*
 * Copyright DataStax, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.datastax.oss.quarkus.tests.mapper;

import com.datastax.oss.driver.api.core.CqlIdentifier;
import com.datastax.oss.driver.api.mapper.annotations.DaoFactory;
import com.datastax.oss.driver.api.mapper.annotations.DaoKeyspace;
import com.datastax.oss.driver.api.mapper.annotations.Mapper;
import com.datastax.oss.quarkus.tests.dao.CustomerDao;
import com.datastax.oss.quarkus.tests.dao.ProductDao;
import com.datastax.oss.quarkus.tests.dao.ProductReactiveDao;

@Mapper
public interface InventoryMapper {

  @DaoFactory
  ProductDao productDao(@DaoKeyspace CqlIdentifier keyspace);

  @DaoFactory
  ProductReactiveDao productReactiveDao(@DaoKeyspace CqlIdentifier keyspace);

  @DaoFactory
  CustomerDao customerDao(@DaoKeyspace CqlIdentifier keyspace);
}
