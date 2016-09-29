/*
 * Copyright 2005-2006 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the LICENSE file that accompanied this code.
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
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 */
/* Generated By:JavaCC: Do not edit this line. CompactSyntaxConstants.java */
package com.sun.xml.internal.rngom.parse.compact;

public interface CompactSyntaxConstants {

  int EOF = 0;
  int NEWLINE = 37;
  int NOT_NEWLINE = 38;
  int WS = 39;
  int DOCUMENTATION = 40;
  int DOCUMENTATION_CONTINUE = 41;
  int SINGLE_LINE_COMMENT = 42;
  int DOCUMENTATION_AFTER_SINGLE_LINE_COMMENT = 43;
  int SINGLE_LINE_COMMENT_CONTINUE = 44;
  int BASE_CHAR = 45;
  int IDEOGRAPHIC = 46;
  int LETTER = 47;
  int COMBINING_CHAR = 48;
  int DIGIT = 49;
  int EXTENDER = 50;
  int NMSTART = 51;
  int NMCHAR = 52;
  int NCNAME = 53;
  int IDENTIFIER = 54;
  int ESCAPED_IDENTIFIER = 55;
  int PREFIX_STAR = 56;
  int PREFIXED_NAME = 57;
  int LITERAL = 58;
  int FANNOTATE = 59;
  int ILLEGAL_CHAR = 60;

  int DEFAULT = 0;
  int AFTER_SINGLE_LINE_COMMENT = 1;
  int AFTER_DOCUMENTATION = 2;

  String[] tokenImage = {
    "<EOF>",
    "\"[\"",
    "\"=\"",
    "\"&=\"",
    "\"|=\"",
    "\"start\"",
    "\"div\"",
    "\"include\"",
    "\"~\"",
    "\"]\"",
    "\"grammar\"",
    "\"{\"",
    "\"}\"",
    "\"namespace\"",
    "\"default\"",
    "\"inherit\"",
    "\"datatypes\"",
    "\"empty\"",
    "\"text\"",
    "\"notAllowed\"",
    "\"|\"",
    "\"&\"",
    "\",\"",
    "\"+\"",
    "\"?\"",
    "\"*\"",
    "\"element\"",
    "\"attribute\"",
    "\"(\"",
    "\")\"",
    "\"-\"",
    "\"list\"",
    "\"mixed\"",
    "\"external\"",
    "\"parent\"",
    "\"string\"",
    "\"token\"",
    "<NEWLINE>",
    "<NOT_NEWLINE>",
    "<WS>",
    "<DOCUMENTATION>",
    "<DOCUMENTATION_CONTINUE>",
    "<SINGLE_LINE_COMMENT>",
    "<DOCUMENTATION_AFTER_SINGLE_LINE_COMMENT>",
    "<SINGLE_LINE_COMMENT_CONTINUE>",
    "<BASE_CHAR>",
    "<IDEOGRAPHIC>",
    "<LETTER>",
    "<COMBINING_CHAR>",
    "<DIGIT>",
    "<EXTENDER>",
    "<NMSTART>",
    "<NMCHAR>",
    "<NCNAME>",
    "<IDENTIFIER>",
    "<ESCAPED_IDENTIFIER>",
    "<PREFIX_STAR>",
    "<PREFIXED_NAME>",
    "<LITERAL>",
    "\">>\"",
    "<ILLEGAL_CHAR>",
  };

}
