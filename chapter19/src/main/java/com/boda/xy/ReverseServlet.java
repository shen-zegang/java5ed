package com.boda.xy;

//import java.io.IOException;
//import java.io.OutputStreamWriter;
//import java.net.URLDecoder;
//import javax.servlet.ServletInputStream;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//@WebServlet("/reverseServlet.do")
//public class ReverseServlet extends HttpServlet {
//	 private static String message = "Servlet 处理错误";
//    public void doPost(HttpServletRequest request,
//HttpServletResponse response) {
//       try {
//         int len = request.getContentLength();
//         byte[] input = new byte[len];
//         ServletInputStream sin = request.getInputStream();
//         int c, count = 0 ;
//         while ((c = sin.read(input, count, input.length-count)) != -1) {
//            count +=c;
//         }
//         sin.close();
//         String inString = new String(input);
//         int index = inString.indexOf("=");
//         if (index == -1) {
//             response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
//             response.getWriter().print(message);
//             response.getWriter().close();
//             return;
//          }
//         String value = inString.substring(index + 1);
//         // 将application/x-www-form-urlencoded字符串解码成UTF-8格式
//         String decodedString = URLDecoder.decode(value, "UTF-8");
//         // 反转字符串
//         String reverseStr =
//(new StringBuffer(decodedString)).reverse().toString();
//         // 设置响应状态码
//         response.setStatus(HttpServletResponse.SC_OK);
//         OutputStreamWriter writer =
//new OutputStreamWriter(response.getOutputStream());
//         writer.write(reverseStr);
//         writer.flush();
//         writer.close();
//       } catch (IOException e) {
//           try{
//             response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
//             response.getWriter().print(e.getMessage());
//             response.getWriter().close();
//           } catch (IOException ioe) { }
//       }
//   }
//}

