package utils;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CookieManager {
	// 쿠키 생성을 쉽게하는 메서드
	public static void makeCookie(HttpServletResponse response
			, String cName, String cValue, int cTime) {
		// 쿠키 생성
		Cookie cookie = new Cookie(cName, cValue);
		// 경로 설정
		cookie.setPath("/");
		// 유효기간 설정
		cookie.setMaxAge(cTime);
		//응답에 쿠키 추가
		response.addCookie(cookie);
	}
	public static String readCookie(HttpServletRequest request
			, String cName) {
		String cookieValue = "";
		Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for(Cookie c : cookies) {
				String cookieName = c.getName();
				if(cookieName.equals(cName)) {
					cookieValue = c.getValue();
				}
			}
		}
		return cookieValue;
	}
	public static void deleteCookie(HttpServletResponse response, String cName) {
		makeCookie(response, cName, "" ,0);
	}
}










