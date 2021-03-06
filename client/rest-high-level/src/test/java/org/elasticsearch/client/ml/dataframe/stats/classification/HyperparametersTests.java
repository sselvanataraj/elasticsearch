/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.elasticsearch.client.ml.dataframe.stats.classification;

import org.elasticsearch.common.xcontent.XContentParser;
import org.elasticsearch.test.AbstractXContentTestCase;

import java.io.IOException;

public class HyperparametersTests extends AbstractXContentTestCase<Hyperparameters> {

    @Override
    protected boolean supportsUnknownFields() {
        return true;
    }

    @Override
    protected Hyperparameters doParseInstance(XContentParser parser) throws IOException {
        return Hyperparameters.PARSER.apply(parser, null);
    }

    @Override
    protected Hyperparameters createTestInstance() {
        return createRandom();
    }

    public static Hyperparameters createRandom() {
        return new Hyperparameters(
            randomBoolean() ? null : randomAlphaOfLength(10),
            randomBoolean() ? null : randomDouble(),
            randomBoolean() ? null : randomDouble(),
            randomBoolean() ? null : randomDouble(),
            randomBoolean() ? null : randomDouble(),
            randomBoolean() ? null : randomDouble(),
            randomBoolean() ? null : randomDouble(),
            randomBoolean() ? null : randomDouble(),
            randomBoolean() ? null : randomIntBetween(0, Integer.MAX_VALUE),
            randomBoolean() ? null : randomIntBetween(0, Integer.MAX_VALUE),
            randomBoolean() ? null : randomIntBetween(0, Integer.MAX_VALUE),
            randomBoolean() ? null : randomIntBetween(0, Integer.MAX_VALUE),
            randomBoolean() ? null : randomIntBetween(0, Integer.MAX_VALUE),
            randomBoolean() ? null : randomDouble(),
            randomBoolean() ? null : randomDouble()
        );
    }
}
