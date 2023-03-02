<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hola Mundo</h1>
        <h3>Hola yo soy un formulario con metodo POST</h3>
        <form action="MIServlet" method="post">
            <label>Digite usuario: </label>
            <input type="email" name="txt_usuario" placeholder="falso@falso.com" required/><br/><br/>
            <label>Clave de acceso: </label>
            <input type="password" name="txt_clave" required/><br/><br/>
            <input type="submit" name="btn_aceptar" value="Registrar">
            <input type="reset" name="btn_reset" value="Limpiar">
        </form>
    </body>
</html>
