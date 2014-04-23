/*
 * Copyright (c) 2002, 2014, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
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

/*
 * @test
 * @bug 4524136
 * @summary Test to make sure label is used for inline links.
 * @author jamieh
 * @library ../lib/
 * @build JavadocTester
 * @build TestInlineLinkLabel
 * @run main TestInlineLinkLabel
 */

public class TestInlineLinkLabel extends JavadocTester {

    private static final String[][] TEST = {
        //Search for the label to the package link.
        { "pkg/C1.html" ,
            "<a href=\"../pkg/package-summary.html\"><code>Here is a link to a package</code></a>"},

        //Search for the label to the class link
        { "pkg/C1.html" ,
            "<a href=\"../pkg/C2.html\" title=\"class in pkg\"><code>Here is a link to a class</code></a>"}
    };
    private static final String[] ARGS =
        new String[] {
            "-d", OUTPUT_DIR, "-sourcepath", SRC_DIR, "pkg"};

    /**
     * The entry point of the test.
     * @param args the array of command line arguments.
     */
    public static void main(String[] args) {
        TestInlineLinkLabel tester = new TestInlineLinkLabel();
        tester.run(ARGS, TEST, NO_TEST);
        tester.printSummary();
    }
}
