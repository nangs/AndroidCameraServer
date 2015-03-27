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
// Generated from file `wiiMotePrx.java'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

public interface wiiMotePrx extends Ice.ObjectPrx
{
    public int setValue(int Value);

    public int setValue(int Value, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setValue(int Value);

    public Ice.AsyncResult begin_setValue(int Value, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setValue(int Value, Ice.Callback __cb);

    public Ice.AsyncResult begin_setValue(int Value, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_setValue(int Value, Callback_wiiMote_setValue __cb);

    public Ice.AsyncResult begin_setValue(int Value, java.util.Map<String, String> __ctx, Callback_wiiMote_setValue __cb);

    public int end_setValue(Ice.AsyncResult __result);

    public int changeRumbleMode();

    public int changeRumbleMode(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_changeRumbleMode();

    public Ice.AsyncResult begin_changeRumbleMode(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_changeRumbleMode(Ice.Callback __cb);

    public Ice.AsyncResult begin_changeRumbleMode(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_changeRumbleMode(Callback_wiiMote_changeRumbleMode __cb);

    public Ice.AsyncResult begin_changeRumbleMode(java.util.Map<String, String> __ctx, Callback_wiiMote_changeRumbleMode __cb);

    public int end_changeRumbleMode(Ice.AsyncResult __result);

    public int changeIrMode();

    public int changeIrMode(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_changeIrMode();

    public Ice.AsyncResult begin_changeIrMode(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_changeIrMode(Ice.Callback __cb);

    public Ice.AsyncResult begin_changeIrMode(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_changeIrMode(Callback_wiiMote_changeIrMode __cb);

    public Ice.AsyncResult begin_changeIrMode(java.util.Map<String, String> __ctx, Callback_wiiMote_changeIrMode __cb);

    public int end_changeIrMode(Ice.AsyncResult __result);

    public int changeAccMode();

    public int changeAccMode(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_changeAccMode();

    public Ice.AsyncResult begin_changeAccMode(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_changeAccMode(Ice.Callback __cb);

    public Ice.AsyncResult begin_changeAccMode(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_changeAccMode(Callback_wiiMote_changeAccMode __cb);

    public Ice.AsyncResult begin_changeAccMode(java.util.Map<String, String> __ctx, Callback_wiiMote_changeAccMode __cb);

    public int end_changeAccMode(Ice.AsyncResult __result);

    public int changeButtonMode();

    public int changeButtonMode(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_changeButtonMode();

    public Ice.AsyncResult begin_changeButtonMode(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_changeButtonMode(Ice.Callback __cb);

    public Ice.AsyncResult begin_changeButtonMode(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_changeButtonMode(Callback_wiiMote_changeButtonMode __cb);

    public Ice.AsyncResult begin_changeButtonMode(java.util.Map<String, String> __ctx, Callback_wiiMote_changeButtonMode __cb);

    public int end_changeButtonMode(Ice.AsyncResult __result);

    public int changeNunchukMode();

    public int changeNunchukMode(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_changeNunchukMode();

    public Ice.AsyncResult begin_changeNunchukMode(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_changeNunchukMode(Ice.Callback __cb);

    public Ice.AsyncResult begin_changeNunchukMode(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_changeNunchukMode(Callback_wiiMote_changeNunchukMode __cb);

    public Ice.AsyncResult begin_changeNunchukMode(java.util.Map<String, String> __ctx, Callback_wiiMote_changeNunchukMode __cb);

    public int end_changeNunchukMode(Ice.AsyncResult __result);

    public int activateLed(int led);

    public int activateLed(int led, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_activateLed(int led);

    public Ice.AsyncResult begin_activateLed(int led, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_activateLed(int led, Ice.Callback __cb);

    public Ice.AsyncResult begin_activateLed(int led, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_activateLed(int led, Callback_wiiMote_activateLed __cb);

    public Ice.AsyncResult begin_activateLed(int led, java.util.Map<String, String> __ctx, Callback_wiiMote_activateLed __cb);

    public int end_activateLed(Ice.AsyncResult __result);

    public int getButtonData();

    public int getButtonData(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getButtonData();

    public Ice.AsyncResult begin_getButtonData(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getButtonData(Ice.Callback __cb);

    public Ice.AsyncResult begin_getButtonData(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getButtonData(Callback_wiiMote_getButtonData __cb);

    public Ice.AsyncResult begin_getButtonData(java.util.Map<String, String> __ctx, Callback_wiiMote_getButtonData __cb);

    public int end_getButtonData(Ice.AsyncResult __result);

    public NunchukData getNunchukData();

    public NunchukData getNunchukData(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getNunchukData();

    public Ice.AsyncResult begin_getNunchukData(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getNunchukData(Ice.Callback __cb);

    public Ice.AsyncResult begin_getNunchukData(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getNunchukData(Callback_wiiMote_getNunchukData __cb);

    public Ice.AsyncResult begin_getNunchukData(java.util.Map<String, String> __ctx, Callback_wiiMote_getNunchukData __cb);

    public NunchukData end_getNunchukData(Ice.AsyncResult __result);

    public AccelerometerData getAccData();

    public AccelerometerData getAccData(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getAccData();

    public Ice.AsyncResult begin_getAccData(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getAccData(Ice.Callback __cb);

    public Ice.AsyncResult begin_getAccData(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getAccData(Callback_wiiMote_getAccData __cb);

    public Ice.AsyncResult begin_getAccData(java.util.Map<String, String> __ctx, Callback_wiiMote_getAccData __cb);

    public AccelerometerData end_getAccData(Ice.AsyncResult __result);

    public InfraredData getIrData();

    public InfraredData getIrData(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getIrData();

    public Ice.AsyncResult begin_getIrData(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getIrData(Ice.Callback __cb);

    public Ice.AsyncResult begin_getIrData(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getIrData(Callback_wiiMote_getIrData __cb);

    public Ice.AsyncResult begin_getIrData(java.util.Map<String, String> __ctx, Callback_wiiMote_getIrData __cb);

    public InfraredData end_getIrData(Ice.AsyncResult __result);

    public int getBatteryStatus();

    public int getBatteryStatus(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getBatteryStatus();

    public Ice.AsyncResult begin_getBatteryStatus(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getBatteryStatus(Ice.Callback __cb);

    public Ice.AsyncResult begin_getBatteryStatus(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getBatteryStatus(Callback_wiiMote_getBatteryStatus __cb);

    public Ice.AsyncResult begin_getBatteryStatus(java.util.Map<String, String> __ctx, Callback_wiiMote_getBatteryStatus __cb);

    public int end_getBatteryStatus(Ice.AsyncResult __result);
}