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
// Generated from file `ptmotors.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

/**
 * PTMotorsData a class that contains the pantilt data
 **/
public final class PTMotorsDataPrxHelper extends Ice.ObjectPrxHelperBase implements PTMotorsDataPrx
{
    public static PTMotorsDataPrx checkedCast(Ice.ObjectPrx __obj)
    {
        PTMotorsDataPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof PTMotorsDataPrx)
            {
                __d = (PTMotorsDataPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId()))
                {
                    PTMotorsDataPrxHelper __h = new PTMotorsDataPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static PTMotorsDataPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        PTMotorsDataPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof PTMotorsDataPrx)
            {
                __d = (PTMotorsDataPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId(), __ctx))
                {
                    PTMotorsDataPrxHelper __h = new PTMotorsDataPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static PTMotorsDataPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        PTMotorsDataPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId()))
                {
                    PTMotorsDataPrxHelper __h = new PTMotorsDataPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static PTMotorsDataPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        PTMotorsDataPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId(), __ctx))
                {
                    PTMotorsDataPrxHelper __h = new PTMotorsDataPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static PTMotorsDataPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        PTMotorsDataPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof PTMotorsDataPrx)
            {
                __d = (PTMotorsDataPrx)__obj;
            }
            else
            {
                PTMotorsDataPrxHelper __h = new PTMotorsDataPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static PTMotorsDataPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        PTMotorsDataPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            PTMotorsDataPrxHelper __h = new PTMotorsDataPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::jderobot::PTMotorsData"
    };

    public static String ice_staticId()
    {
        return __ids[1];
    }

    protected Ice._ObjectDelM __createDelegateM()
    {
        return new _PTMotorsDataDelM();
    }

    protected Ice._ObjectDelD __createDelegateD()
    {
        return new _PTMotorsDataDelD();
    }

    public static void __write(IceInternal.BasicStream __os, PTMotorsDataPrx v)
    {
        __os.writeProxy(v);
    }

    public static PTMotorsDataPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            PTMotorsDataPrxHelper result = new PTMotorsDataPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
