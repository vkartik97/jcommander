/*
 * Copyright 2014 alaw3.
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
package com.beust.jcommander.args;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.internal.Lists;
import java.util.List;

/**
 *
 * @author alaw3
 */
public class AlternateNamesForListArgs {

    @Parameter(names = {"-s", "--servers"}, description = "blah")
    public List<String> serverNames = Lists.newLinkedList();
}
