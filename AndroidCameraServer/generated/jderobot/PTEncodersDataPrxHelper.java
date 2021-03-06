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
// Generated from file `ptencoders.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

/**
 * ptencoders dat information 
 **/
public final class PTEncodersDataPrxHelper extends Ice.ObjectPrxHelperBase implements PTEncodersDataPrx
{
    public static PTEncodersDataPrx checkedCast(Ice.ObjectPrx __obj)
    {
        PTEncodersDataPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof PTEncodersDataPrx)
            {
                __d = (PTEncodersDataPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId()))
                {
                    PTEncodersDataPrxHelper __h = new PTEncodersDataPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static PTEncodersDataPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        PTEncodersDataPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof PTEncodersDataPrx)
            {
                __d = (PTEncodersDataPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId(), __ctx))
                {
                    PTEncodersDataPrxHelper __h = new PTEncodersDataPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static PTEncodersDataPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        PTEncodersDataPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId()))
                {
                    PTEncodersDataPrxHelper __h = new PTEncodersDataPrxHelper();
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

    public static PTEncodersDataPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        PTEncodersDataPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId(), __ctx))
                {
                    PTEncodersDataPrxHelper __h = new PTEncodersDataPrxHelper();
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

    public static PTEncodersDataPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        PTEncodersDataPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof PTEncodersDataPrx)
            {
                __d = (PTEncodersDataPrx)__obj;
            }
            else
            {
                PTEncodersDataPrxHelper __h = new PTEncodersDataPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static PTEncodersDataPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        PTEncodersDataPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            PTEncodersDataPrxHelper __h = new PTEncodersDataPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::jderobot::PTEncodersData"
    };

    public static String ice_staticId()
    {
        return __ids[1];
    }

    protected Ice._ObjectDelM __createDelegateM()
    {
        return new _PTEncodersDataDelM();
    }

    protected Ice._ObjectDelD __createDelegateD()
    {
        return new _PTEncodersDataDelD();
    }

    public static void __write(IceInternal.BasicStream __os, PTEncodersDataPrx v)
    {
        __os.writeProxy(v);
    }

    public static PTEncodersDataPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            PTEncodersDataPrxHelper result = new PTEncodersDataPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
