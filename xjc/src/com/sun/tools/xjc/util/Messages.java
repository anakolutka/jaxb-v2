/*
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the "License").  You may not use this file except
 * in compliance with the License.
 * 
 * You can obtain a copy of the license at
 * https://jwsdp.dev.java.net/CDDLv1.0.html
 * See the License for the specific language governing
 * permissions and limitations under the License.
 * 
 * When distributing Covered Code, include this CDDL
 * HEADER in each file and include the License file at
 * https://jwsdp.dev.java.net/CDDLv1.0.html  If applicable,
 * add the following below this CDDL HEADER, with the
 * fields enclosed by brackets "[]" replaced with your
 * own identifying information: Portions Copyright [yyyy]
 * [name of copyright owner]
 */

package com.sun.tools.xjc.util;

import java.text.MessageFormat;
import java.util.ResourceBundle;

/**
 * Formats error messages.
 */
class Messages
{
    /** Loads a string resource and formats it with specified arguments. */
    static String format( String property, Object... args ) {
        String text = ResourceBundle.getBundle(Messages.class.getPackage().getName() +".MessageBundle").getString(property);
        return MessageFormat.format(text,args);
    }
    

    static final String ERR_CLASSNAME_COLLISION =
        "CodeModelClassFactory.ClassNameCollision";

    static final String ERR_CLASSNAME_COLLISION_SOURCE =
        "CodeModelClassFactory.ClassNameCollision.Source";

    static final String ERR_INVALID_CLASSNAME =
        "ERR_INVALID_CLASSNAME";

    static final String ERR_CASE_SENSITIVITY_COLLISION = // 2 args
        "CodeModelClassFactory.CaseSensitivityCollision";

    static final String ERR_CHAMELEON_SCHEMA_GONE_WILD = // no argts
        "ERR_CHAMELEON_SCHEMA_GONE_WILD";
}
