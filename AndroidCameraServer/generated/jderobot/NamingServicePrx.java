// **********************************************************************
//
// Copyright (c) 2003-2013 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.5.1
//
// <auto-generated>
//
// Generated from file `namingService.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

public interface NamingServicePrx extends Ice.ObjectPrx
{
    public void bind(NamingNode node)
        throws NameAlreadyExistException;

    public void bind(NamingNode node, java.util.Map<String, String> __ctx)
        throws NameAlreadyExistException;

    public Ice.AsyncResult begin_bind(NamingNode node);

    public Ice.AsyncResult begin_bind(NamingNode node, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_bind(NamingNode node, Ice.Callback __cb);

    public Ice.AsyncResult begin_bind(NamingNode node, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_bind(NamingNode node, Callback_NamingService_bind __cb);

    public Ice.AsyncResult begin_bind(NamingNode node, java.util.Map<String, String> __ctx, Callback_NamingService_bind __cb);

    public void end_bind(Ice.AsyncResult __result)
        throws NameAlreadyExistException;

    public void unbind(NamingNode node)
        throws NameAlreadyExistException,
               NameNotExistException;

    public void unbind(NamingNode node, java.util.Map<String, String> __ctx)
        throws NameAlreadyExistException,
               NameNotExistException;

    public Ice.AsyncResult begin_unbind(NamingNode node);

    public Ice.AsyncResult begin_unbind(NamingNode node, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_unbind(NamingNode node, Ice.Callback __cb);

    public Ice.AsyncResult begin_unbind(NamingNode node, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_unbind(NamingNode node, Callback_NamingService_unbind __cb);

    public Ice.AsyncResult begin_unbind(NamingNode node, java.util.Map<String, String> __ctx, Callback_NamingService_unbind __cb);

    public void end_unbind(Ice.AsyncResult __result)
        throws NameAlreadyExistException,
               NameNotExistException;

    public NodeContainer resolveByName(String name)
        throws NameNotExistException;

    public NodeContainer resolveByName(String name, java.util.Map<String, String> __ctx)
        throws NameNotExistException;

    public Ice.AsyncResult begin_resolveByName(String name);

    public Ice.AsyncResult begin_resolveByName(String name, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_resolveByName(String name, Ice.Callback __cb);

    public Ice.AsyncResult begin_resolveByName(String name, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_resolveByName(String name, Callback_NamingService_resolveByName __cb);

    public Ice.AsyncResult begin_resolveByName(String name, java.util.Map<String, String> __ctx, Callback_NamingService_resolveByName __cb);

    public NodeContainer end_resolveByName(Ice.AsyncResult __result)
        throws NameNotExistException;

    public NodeContainer resolveByInterface(String interfaceName)
        throws InterfaceNotExistException;

    public NodeContainer resolveByInterface(String interfaceName, java.util.Map<String, String> __ctx)
        throws InterfaceNotExistException;

    public Ice.AsyncResult begin_resolveByInterface(String interfaceName);

    public Ice.AsyncResult begin_resolveByInterface(String interfaceName, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_resolveByInterface(String interfaceName, Ice.Callback __cb);

    public Ice.AsyncResult begin_resolveByInterface(String interfaceName, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_resolveByInterface(String interfaceName, Callback_NamingService_resolveByInterface __cb);

    public Ice.AsyncResult begin_resolveByInterface(String interfaceName, java.util.Map<String, String> __ctx, Callback_NamingService_resolveByInterface __cb);

    public NodeContainer end_resolveByInterface(Ice.AsyncResult __result)
        throws InterfaceNotExistException;
}
