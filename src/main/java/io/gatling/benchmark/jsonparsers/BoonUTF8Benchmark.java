/*
 * Copyright (c) 2005, 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package io.gatling.benchmark.jsonparsers;

import java.util.concurrent.TimeUnit;

import org.boon.json.JsonUTF8Parser;
import org.openjdk.jmh.annotations.GenerateMicroBenchmark;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.logic.BlackHole;

@OutputTimeUnit(TimeUnit.SECONDS)
public class BoonUTF8Benchmark extends AbstractBenchmark {

    protected Object parse(byte[] bytes) throws Exception {
        return JsonUTF8Parser.parseMap(bytes);
    }

    @GenerateMicroBenchmark
    public void actionLabel(BlackHole bh) throws Exception {
        super.actionLabel(bh);
    }

    @GenerateMicroBenchmark
    public void citmCatalog(BlackHole bh) throws Exception {
        super.citmCatalog(bh);
    }

    @GenerateMicroBenchmark
    public void medium(BlackHole bh) throws Exception {
        super.medium(bh);
    }

    @GenerateMicroBenchmark
    public void menu(BlackHole bh) throws Exception {
        super.menu(bh);
    }

    @GenerateMicroBenchmark
    public void sgml(BlackHole bh) throws Exception {
        super.sgml(bh);
    }

    @GenerateMicroBenchmark
    public void small(BlackHole bh) throws Exception {
        super.small(bh);
    }

    @GenerateMicroBenchmark
    public void webxml(BlackHole bh) throws Exception {
        super.webxml(bh);
    }

    @GenerateMicroBenchmark
    public void widget(BlackHole bh) throws Exception {
        super.widget(bh);
    }

    @GenerateMicroBenchmark
    public void roundRobin(ThreadState state, BlackHole bh) throws Exception {
        super.roundRobin(state, bh);
    }
}