package com.lendage.api.avmservice.api;

import org.springframework.web.context.request.NativeWebRequest;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ApiUtil {
    public static void setExampleResponse(NativeWebRequest req, String contentType, String example) {
        try {
            HttpServletResponse res = req.getNativeResponse(HttpServletResponse.class);
            res.setCharacterEncoding("UTF-8");
            res.addHeader("Content-Type", contentType);
            res.getWriter().print(example);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String readFileFromURL(String url) throws MalformedURLException, IOException {
        Scanner sc = new Scanner((new URL(url)).openStream(), "UTF-8");

        String var3;
        try {
            String out = sc.useDelimiter("\\A").next();
            var3 = out;
        } finally {
            sc.close();
        }

        return var3;
    }

}