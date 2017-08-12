<%@page import="com.sv.udb.controladores.PersonasCtrl"%>
<%@page import="com.sv.udb.modelo.Personas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel='stylesheet' href='webjars/materialize/0.97.3/dist/css/materialize.min.css'>
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <script type="text/javascript" src="webjars/jquery/2.1.1/jquery.min.js"></script>
        <script type="text/javascript" src="webjars/materialize/0.97.3/dist/js/materialize.min.js"></script>
        <title>Enviar Correo</title>
    </head>
    <body>
        <div class="container ">
           <form method="POST" action="CorreoServ" name="Demo"> 
            <div class="input-field col s12 m12 l12">
                <select name="dest" id="dest" multiple>
                  <option value="" disabled selected>Destinatario</option>
                   <%
                         for(Personas temp : new PersonasCtrl().consTodo())
                     {
                    %>
                     <option value="<%=temp.getCorreo()%>"><%=temp.getNombPers()%></option>
                     <%
                      }
                     %>
                </select>
                <label>Para:</label>
          </div>
                <br>
                <div class="input-field col s6">
                    <input id="asunto" name="asunto" type="text" class="validate">
                <label for="asunto">Asunto</label>
              </div>
                <br>
          <div class="input-field col s12 m12 l12">
                <select name="cc" id="cc">
                  <option value="xvwilito11@gmail.com" disabled selected>Destinatario</option>
                   <%
                         for(Personas temp : new PersonasCtrl().consTodo())
                     {
                    %>
                     <option value="<%=temp.getCorreo()%>"><%=temp.getNombPers()%></option>
                     <%
                      }
                     %>
                </select>
                <label>CC:</label>
          </div>
              <br>  
          <div class="input-field col s12 m12 l12">
                <select name="cco" id="cco">
                  <option value="xvwilito11@gmail.com" disabled selected>Destinatario</option>
                   <%
                         for(Personas temp : new PersonasCtrl().consTodo())
                     {
                    %>
                     <option value="<%=temp.getCorreo()%>"><%=temp.getNombPers()%></option>
                     <%
                      }
                     %>
                </select>
                <label>CCO:</label>
          </div>
                
          <div class="row">

              <div class="row">
                <div class="input-field col s12 m12 l12">
                  <textarea id="mensaje" class="materialize-textarea" name="mensaje"></textarea>
                  <label for="mensaje">Mensaje</label>
                </div>
              </div>
          </div>
                 <button class="btn waves-effect waves-light green darken-1" type="submit" value="Enviar" name="btonDenu">Enviar
            <i class="material-icons right">send</i>
        </button>
        <button class="btn waves-effect waves-light red darken-4" type="submit" value="Cancelar" name="btonDenu">Cancelar
            <i class="material-icons right">close</i>
        </button>        
        </form>
        </div>
       
        <script>
                $(document).ready(function() {
                $('select').material_select();
              });
        </script>
    </body>
</html>
