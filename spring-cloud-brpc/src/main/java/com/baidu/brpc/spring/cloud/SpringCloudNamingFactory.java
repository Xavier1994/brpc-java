/*
 * Copyright (c) 2018 Baidu, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.baidu.brpc.spring.cloud;

import com.baidu.brpc.naming.BrpcURL;
import com.baidu.brpc.naming.NamingService;
import com.baidu.brpc.naming.NamingServiceFactory;

public class SpringCloudNamingFactory implements NamingServiceFactory {
    public static final String NAMING_PREFIX = "springcloud";

    @Override
    public String getName() {
        return NAMING_PREFIX;
    }

    @Override
    public NamingService createNamingService(BrpcURL url) {
        return new SpringCloudNamingService(url);
    }
}
