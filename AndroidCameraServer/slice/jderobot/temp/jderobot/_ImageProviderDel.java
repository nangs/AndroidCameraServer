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
// Generated from file `_ImageProviderDel.java'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

public interface _ImageProviderDel extends Ice._ObjectDel
{
    ImageDescription getImageDescription(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    ImageData getImageData(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               DataNotExistException,
               HardwareFailedException;
}
