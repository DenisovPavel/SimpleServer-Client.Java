# Пробная версия __Web Server__ (оснавная цель - понимание работы сервер <=> клиент )
 - Создал __Port__(**8088**)
 - Создал __Socket__

 - Проверил по браузеру локальный хост http://localhost:8088/

 - через *BufferedReader input = new BufferedReader(
   new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8))*
## Эта цепь методов дает нам следущее: ##

### Получение запроса с клиента ###

```width:300px|dot
digraph Method {
  BufferedReader -> InputStreamReader -> getInputStream -> StandardCharsets.UTF_8
}
```
 - getInputStream() - получает набор байтов 
 - StandardCharsets.UTF_8 - далее байты переходят в текст 
 - InputStreamReader - считывает символы
 - BufferedReader() - считывает целые строки 


### Тоже самое на ответ ###
````
PrintWriter output = new PrintWriter(socket.getOutputStream());
````
### Ответ с сервера в формате ###

```
output.println("HTTP/1.1 200 OK");
output.println("Content-Type:text/html; charset=utf-8");
```
Где __200__ - ответ с сервера о успешном запросе
 и __Content-Type:text/html__ - это тип контента(тест в формате __html__),
и в __charset=utf-8"__ - кодировке utf8

Ответ от сервера с пропуском строки
```
output.println();
output.println("<h1> Hello from Server! </h1>");

```
завершаем через метод 
```
output.flush();

```
он немедленно отправляет ответ!

input.close();//чтобы закрывались
output.close();// по окончанию обработки всех запросов

При выходе из программы не забываем выходить с сервера и разрывать соединение.