package ru.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/MyServlet", description="Мое описание сервлета", displayName="displayName")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
	}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("firstName");
		String surname = request.getParameter("secondName");
		String patronymic = request.getParameter("thirdName");
		String birthplace = request.getParameter("birthPlace");
		String gender = request.getParameter("gender");
		//Проверка на пустое значение
		if(gender==null) {
			gender="Поле не выбрано";
		}
		String age18 = request.getParameter("age18");
		//Проверка на пустое значение
		if(age18==null) {
			age18="Поле не выбрано";
		}
		String login = request.getParameter("login");
		String pass = request.getParameter("password");
		String email = request.getParameter("email");
		if(email ==null) {
			email="email отсутсвует";
		}
		
		//Выводим в консоль параметры пользователя
		System.out.println("Имя: "+ name);
		System.out.println("Фамилия: " + surname);
		System.out.println("Отчество: " + patronymic);
		System.out.println("Место рождения: " + birthplace);
		System.out.println("Пол: " + gender);
		System.out.println("Старше 18: " + age18);
		System.out.println("Логин: " +login);
		System.out.println("Пароль: " +pass);
		System.out.println("email: " +email);
		
		response.setContentType("text/html;charset=utf-8");
		
		//Возвращаем пользователю данные
		PrintWriter out = response.getWriter();
		out.println("<h3>Создан профиль</h3>");
		out.println("Имя: " +name + "<br>");
		out.println("Фамилия: " +surname +"<br>");
		out.println("Отчество: " +patronymic +"<br>");
		out.println("Место рождения: " +birthplace + "<br>");
		out.println("Пол: " +gender + "<br>");
		out.println("Старше 18: " +age18 + "<br>");
		out.println("email: " +email + "<br>");
		out.close();
	}

}
