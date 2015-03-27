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
// Generated from file `ConfigurationNotExistException.java'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

public class ConfigurationNotExistException extends JderobotException
{
    public ConfigurationNotExistException()
    {
        super();
    }

    public ConfigurationNotExistException(Throwable cause)
    {
        super(cause);
    }

    public ConfigurationNotExistException(String what)
    {
        super(what);
    }

    public ConfigurationNotExistException(String what, Throwable cause)
    {
        super(what, cause);
    }

    public String
    ice_name()
    {
        return "jderobot::ConfigurationNotExistException";
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeString("::jderobot::ConfigurationNotExistException");
        __os.startWriteSlice();
        __os.endWriteSlice();
        super.__write(__os);
    }

    public void
    __read(IceInternal.BasicStream __is, boolean __rid)
    {
        if(__rid)
        {
            __is.readString();
        }
        __is.startReadSlice();
        __is.endReadSlice();
        super.__read(__is, true);
    }

    public void
    __write(Ice.OutputStream __outS)
    {
        Ice.MarshalException ex = new Ice.MarshalException();
        ex.reason = "exception jderobot::ConfigurationNotExistException was not generated with stream support";
        throw ex;
    }

    public void
    __read(Ice.InputStream __inS, boolean __rid)
    {
        Ice.MarshalException ex = new Ice.MarshalException();
        ex.reason = "exception jderobot::ConfigurationNotExistException was not generated with stream support";
        throw ex;
    }
}