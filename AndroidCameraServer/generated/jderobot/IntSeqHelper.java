// **********************************************************************
//
// Copyright (c) 2003-2011 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.4.2
//
// <auto-generated>
//
// Generated from file `IntSeqHelper.java'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

public final class IntSeqHelper
{
    public static void
    write(IceInternal.BasicStream __os, int[] __v)
    {
        __os.writeIntSeq(__v);
    }

    public static int[]
    read(IceInternal.BasicStream __is)
    {
        int[] __v;
        __v = __is.readIntSeq();
        return __v;
    }
}