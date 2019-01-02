/*
 * Copyright 2018-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.r2dbc.function.connectionfactory;

import io.r2dbc.spi.Connection;

import java.sql.Wrapper;

/**
 * Subinterface of {@link Connection} to be implemented by Connection proxies. Allows access to the underlying target
 * Connection.
 * <p/>
 * This interface can be checked when there is a need to cast to a native R2DBC {@link Connection}.
 *
 * @author Mark Paluch
 */
public interface ConnectionProxy extends Connection, Wrapper {

	/**
	 * Return the target Connection of this proxy.
	 * <p/>
	 * This will typically be the native driver Connection or a wrapper from a connection pool.
	 *
	 * @return the underlying Connection (never {@literal null})
	 */
	Connection getTargetConnection();
}
