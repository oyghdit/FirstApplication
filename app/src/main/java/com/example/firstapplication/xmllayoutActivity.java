package com.example.firstapplication;

import android.app.Activity;
import android.content.res.XmlResourceParser;
import android.os.Bundle;

import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

public class xmllayoutActivity extends Activity {
    protected void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.xmllayout);
        XmlResourceParser xm=getResources().getXml(R.xml.customer);
        StringBuffer stringBuffer=new StringBuffer("");
        while (true){
            try {
                if (!(xm.getEventType()!=XmlResourceParser.END_DOCUMENT)) break;
            } catch (XmlPullParserException e) {
                e.printStackTrace();
            }
            try {
                if(xm.getEventType()==XmlResourceParser.START_TAG){
                    String tagName=xm.getName();
                    if(tagName.equals("customer")){
                        stringBuffer.append("姓名"+xm.getAttributeValue(0)+"");
                        stringBuffer.append("email"+xm.getAttributeValue(1)+"");
                        stringBuffer.append("\n");
                    }

                }
            } catch (XmlPullParserException e) {
                e.printStackTrace();
            }
            try {
                xm.next();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (XmlPullParserException e) {
                e.printStackTrace();
            }
        }

    }
}
