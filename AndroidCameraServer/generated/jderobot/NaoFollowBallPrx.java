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
// Generated from file `naofollowball.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

/**
 * Interface to the Nao follow-ball
 **/
public interface NaoFollowBallPrx extends Ice.ObjectPrx
{
    public void setParams(int rMin, int rMax, int gMin, int gMax, int bMin, int bMax);

    public void setParams(int rMin, int rMax, int gMin, int gMax, int bMin, int bMax, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setParams(int rMin, int rMax, int gMin, int gMax, int bMin, int bMax);

    public Ice.AsyncResult begin_setParams(int rMin, int rMax, int gMin, int gMax, int bMin, int bMax, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setParams(int rMin, int rMax, int gMin, int gMax, int bMin, int bMax, Ice.Callback __cb);

    public Ice.AsyncResult begin_setParams(int rMin, int rMax, int gMin, int gMax, int bMin, int bMax, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_setParams(int rMin, int rMax, int gMin, int gMax, int bMin, int bMax, Callback_NaoFollowBall_setParams __cb);

    public Ice.AsyncResult begin_setParams(int rMin, int rMax, int gMin, int gMax, int bMin, int bMax, java.util.Map<String, String> __ctx, Callback_NaoFollowBall_setParams __cb);

    public void end_setParams(Ice.AsyncResult __result);

    public void setMinParams(int rMin, int gMin, int bMin);

    public void setMinParams(int rMin, int gMin, int bMin, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setMinParams(int rMin, int gMin, int bMin);

    public Ice.AsyncResult begin_setMinParams(int rMin, int gMin, int bMin, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setMinParams(int rMin, int gMin, int bMin, Ice.Callback __cb);

    public Ice.AsyncResult begin_setMinParams(int rMin, int gMin, int bMin, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_setMinParams(int rMin, int gMin, int bMin, Callback_NaoFollowBall_setMinParams __cb);

    public Ice.AsyncResult begin_setMinParams(int rMin, int gMin, int bMin, java.util.Map<String, String> __ctx, Callback_NaoFollowBall_setMinParams __cb);

    public void end_setMinParams(Ice.AsyncResult __result);

    public void setMaxParams(int rMax, int gMax, int bMax);

    public void setMaxParams(int rMax, int gMax, int bMax, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setMaxParams(int rMax, int gMax, int bMax);

    public Ice.AsyncResult begin_setMaxParams(int rMax, int gMax, int bMax, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setMaxParams(int rMax, int gMax, int bMax, Ice.Callback __cb);

    public Ice.AsyncResult begin_setMaxParams(int rMax, int gMax, int bMax, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_setMaxParams(int rMax, int gMax, int bMax, Callback_NaoFollowBall_setMaxParams __cb);

    public Ice.AsyncResult begin_setMaxParams(int rMax, int gMax, int bMax, java.util.Map<String, String> __ctx, Callback_NaoFollowBall_setMaxParams __cb);

    public void end_setMaxParams(Ice.AsyncResult __result);

    public void start();

    public void start(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_start();

    public Ice.AsyncResult begin_start(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_start(Ice.Callback __cb);

    public Ice.AsyncResult begin_start(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_start(Callback_NaoFollowBall_start __cb);

    public Ice.AsyncResult begin_start(java.util.Map<String, String> __ctx, Callback_NaoFollowBall_start __cb);

    public void end_start(Ice.AsyncResult __result);

    public void stop();

    public void stop(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_stop();

    public Ice.AsyncResult begin_stop(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_stop(Ice.Callback __cb);

    public Ice.AsyncResult begin_stop(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_stop(Callback_NaoFollowBall_stop __cb);

    public Ice.AsyncResult begin_stop(java.util.Map<String, String> __ctx, Callback_NaoFollowBall_stop __cb);

    public void end_stop(Ice.AsyncResult __result);
}
