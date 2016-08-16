/**
 * Copyright (C) 2016 Tirasa
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.tirasa.test.surefire1268;

import org.junit.runner.Description;
import org.junit.runner.notification.RunListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotDoingSoMuchListener extends RunListener {

    private static final Logger LOG = LoggerFactory.getLogger(NotDoingSoMuchListener.class);

    @Override
    public void testRunStarted(final Description description) throws Exception {
        super.testRunStarted(description);
    }

}
