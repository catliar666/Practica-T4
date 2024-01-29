package Comunicaciones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PlantillaCambiaEstado {

    public static String generaPlantillaCambiaEstado(String nombre, String numSeguimiento, String fecha, String estadoEnvio, String direccionEntrega, String localidad, String provincia){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional //EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
               "<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\">\n" +
               "<head>\n" +
               "\n" +
               "  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
               "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
               "  <meta name=\"x-apple-disable-message-reformatting\">\n" +
               "  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
               "  <title></title>\n" +
               "  \n" +
               "    <style type=\"text/css\">\n" +
               "      @media only screen and (min-width: 620px) {\n" +
               "  .u-row {\n" +
               "    width: 600px !important;\n" +
               "  }\n" +
               "  .u-row .u-col {\n" +
               "    vertical-align: top;\n" +
               "  }\n" +
               "\n" +
               "  .u-row .u-col-33p33 {\n" +
               "    width: 199.98px !important;\n" +
               "  }\n" +
               "\n" +
               "  .u-row .u-col-50 {\n" +
               "    width: 300px !important;\n" +
               "  }\n" +
               "\n" +
               "  .u-row .u-col-100 {\n" +
               "    width: 600px !important;\n" +
               "  }\n" +
               "\n" +
               "}\n" +
               "\n" +
               "@media (max-width: 620px) {\n" +
               "  .u-row-container {\n" +
               "    max-width: 100% !important;\n" +
               "    padding-left: 0px !important;\n" +
               "    padding-right: 0px !important;\n" +
               "  }\n" +
               "  .u-row .u-col {\n" +
               "    min-width: 320px !important;\n" +
               "    max-width: 100% !important;\n" +
               "    display: block !important;\n" +
               "  }\n" +
               "  .u-row {\n" +
               "    width: 100% !important;\n" +
               "  }\n" +
               "  .u-col {\n" +
               "    width: 100% !important;\n" +
               "  }\n" +
               "  .u-col > div {\n" +
               "    margin: 0 auto;\n" +
               "  }\n" +
               "}\n" +
               "body {\n" +
               "  margin: 0;\n" +
               "  padding: 0;\n" +
               "}\n" +
               "\n" +
               "table,\n" +
               "tr,\n" +
               "td {\n" +
               "  vertical-align: top;\n" +
               "  border-collapse: collapse;\n" +
               "}\n" +
               "\n" +
               "p {\n" +
               "  margin: 0;\n" +
               "}\n" +
               "\n" +
               ".ie-container table,\n" +
               ".mso-container table {\n" +
               "  table-layout: fixed;\n" +
               "}\n" +
               "\n" +
               "* {\n" +
               "  line-height: inherit;\n" +
               "}\n" +
               "\n" +
               "a[x-apple-data-detectors='true'] {\n" +
               "  color: inherit !important;\n" +
               "  text-decoration: none !important;\n" +
               "}\n" +
               "\n" +
               "@media (max-width: 480px) {\n" +
               "  .hide-mobile {\n" +
               "    max-height: 0px;\n" +
               "    overflow: hidden;\n" +
               "    display: none !important;\n" +
               "  }\n" +
               "}\n" +
               "\n" +
               "table, td { color: #000000; } #u_body a { color: #0000ee; text-decoration: underline; } @media (max-width: 480px) { #u_content_menu_1 .v-font-size { font-size: 13px !important; } #u_content_menu_1 .v-layout-display { display: inline !important; } #u_content_menu_1 .v-padding { padding: 7px !important; } #u_content_image_1 .v-src-width { width: auto !important; } #u_content_image_1 .v-src-max-width { max-width: 80% !important; } #u_content_text_1 .v-font-size { font-size: 30px !important; } #u_content_text_2 .v-font-size { font-size: 26px !important; } #u_content_text_2 .v-line-height { line-height: 110% !important; } #u_content_heading_13 .v-font-size { font-size: 17px !important; } #u_content_heading_13 .v-line-height { line-height: 120% !important; } #u_content_text_4 .v-font-size { font-size: 13px !important; } #u_content_image_9 .v-container-padding-padding { padding: 30px 10px 0px !important; } #u_content_image_9 .v-src-width { width: auto !important; } #u_content_image_9 .v-src-max-width { max-width: 25% !important; } #u_content_social_1 .v-container-padding-padding { padding: 30px 10px 10px !important; } #u_content_text_5 .v-container-padding-padding { padding: 10px 10px 30px !important; } }\n" +
               "    </style>\n" +
               "  \n" +
               "  \n" +
               "\n" +
               "<link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700&display=swap\" rel=\"stylesheet\" type=\"text/css\">\n" +
               "\n" +
               "</head>\n" +
               "\n" +
               "<body class=\"clean-body u_body\" style=\"margin: 0;padding: 0;-webkit-text-size-adjust: 100%;background-color: #e7e7e7;color: #000000\">\n" +
               "\n" +
               "  <table id=\"u_body\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;min-width: 320px;Margin: 0 auto;background-color: #e7e7e7;width:100%\" cellpadding=\"0\" cellspacing=\"0\">\n" +
               "  <tbody>\n" +
               "  <tr style=\"vertical-align: top\">\n" +
               "    <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
               "    <table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td align=\"center\" style=\"background-color: #e7e7e7;\">\n" +
               "    \n" +
               "  \n" +
               "  \n" +
               "<div class=\"u-row-container\" style=\"padding: 0px 0px 2px;background-color: transparent\">\n" +
               "  <div class=\"u-row\" style=\"margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\">\n" +
               "    <div style=\"border-collapse: collapse;display: table;width: 100%;height: 100%;background-color: transparent;\">\n" +
               "     \n" +
               "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
               "  <div style=\"background-color: #ffffff;height: 100%;width: 100% !important;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\">\n" +
               "  <div style=\"box-sizing: border-box; height: 100%; padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\"><!--<![endif]-->\n" +
               "  \n" +
               "<table id=\"u_content_menu_1\" style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
               "  <tbody>\n" +
               "    <tr>\n" +
               "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\n" +
               "        \n" +
               "<div class=\"menu\" style=\"text-align:center\">\n" +
               "\n" +
               "  \n" +
               "    <a href=\"https://www.unlayer.com\" target=\"_self\" style=\"padding:5px 15px;display:inline-block;color:#000000;font-size:14px;text-decoration:none\"  class=\"v-padding v-font-size v-layout-display\">\n" +
               "      Inicio\n" +
               "    </a>\n" +
               "  \n" +
               "  \n" +
               "    <span style=\"padding:5px 15px;display:inline-block;color:#000000;font-size:14px;\" class=\"v-padding v-font-size hide-mobile\">\n" +
               "      |\n" +
               "    </span>\n" +
               "    \n" +
               "  \n" +
               "    <a href=\"https://www.unlayer.com\" target=\"_self\" style=\"padding:5px 15px;display:inline-block;color:#000000;font-size:14px;text-decoration:none\"  class=\"v-padding v-font-size v-layout-display\">\n" +
               "      Página\n" +
               "    </a>\n" +
               "  \n" +
               "  \n" +
               "    <span style=\"padding:5px 15px;display:inline-block;color:#000000;font-size:14px;\" class=\"v-padding v-font-size hide-mobile\">\n" +
               "      |\n" +
               "    </span>\n" +
               "   \n" +
               "  \n" +
               "    <a href=\"https://www.unlayer.com\" target=\"_self\" style=\"padding:5px 15px;display:inline-block;color:#000000;font-size:14px;text-decoration:none\"  class=\"v-padding v-font-size v-layout-display\">\n" +
               "      Sobre nosotros\n" +
               "    </a>\n" +
               "  \n" +
               "\n" +
               "    <span style=\"padding:5px 15px;display:inline-block;color:#000000;font-size:14px;\" class=\"v-padding v-font-size hide-mobile\">\n" +
               "      |\n" +
               "    </span>\n" +
               "    \n" +
               "  \n" +
               "    <a href=\"https://www.unlayer.com\" target=\"_self\" style=\"padding:5px 15px;display:inline-block;color:#000000;font-size:14px;text-decoration:none\"  class=\"v-padding v-font-size v-layout-display\">\n" +
               "      Contáctanos\n" +
               "    </a>\n" +
               "  \n" +
               "  \n" +
               "</div>\n" +
               "\n" +
               "      </td>\n" +
               "    </tr>\n" +
               "  </tbody>\n" +
               "</table>\n" +
               "\n" +
               "</div>\n" +
               "  </div>\n" +
               "</div>\n" +
               "\n" +
               "    </div>\n" +
               "  </div>\n" +
               "  </div>\n" +
               "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
               "  <div class=\"u-row\" style=\"margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\">\n" +
               "    <div style=\"border-collapse: collapse;display: table;width: 100%;height: 100%;background-color: transparent;\">\n" +
               "      \n" +
               "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
               "  <div style=\"background-color: #f2f2f2;height: 100%;width: 100% !important;\">\n" +
               "<div style=\"box-sizing: border-box; height: 100%; padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
               "  \n" +
               "<table id=\"u_content_image_1\" style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
               "  <tbody>\n" +
               "    <tr>\n" +
               "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:10px 10px 30px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\n" +
               "        \n" +
               "<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n" +
               "  <tr>\n" +
               "    <td style=\"padding-right: 0px;padding-left: 0px;\" align=\"center\">\n" +
               "      \n" +
               "      <img align=\"center\" border=\"0\" src=\"https://i.ibb.co/Zc4V1ZT/025bb48c-e676-42bb-9b34-cdcc3f0cb0ba-removebg-preview.png\" alt=\"image\" title=\"image\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: inline-block !important;border: none;height: auto;float: none;width: 61%;max-width: 353.8px;\" width=\"353.8\" class=\"v-src-width v-src-max-width\"/>\n" +
               "      \n" +
               "    </td>\n" +
               "  </tr>\n" +
               "</table>\n" +
               "\n" +
               "      </td>\n" +
               "    </tr>\n" +
               "  </tbody>\n" +
               "</table>\n" +
               "\n" +
               "<table id=\"u_content_text_1\" style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
               "  <tbody>\n" +
               "    <tr>\n" +
               "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:10px 10px 0px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\n" +
               "        \n" +
               "  <div class=\"v-line-height v-font-size\" style=\"font-size: 38px; line-height: 140%; text-align: center; word-wrap: break-word;\">\n" +
               "    <p style=\"line-height: 140%;\"><strong><span style=\"background-color: #9d7cf4; line-height: 53.2px; color: #ecf0f1;\"> Tu paquete se ha actualizado </span></strong></p>\n" +
               "  </div>\n" +
               "\n" +
               "      </td>\n" +
               "    </tr>\n" +
               "  </tbody>\n" +
               "</table>\n" +
               "\n" +
               "<table id=\"u_content_text_2\" style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
               "  <tbody>\n" +
               "    <tr>\n" +
               "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:4px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\n" +
               "        \n" +
               "  <div class=\"v-line-height v-font-size\" style=\"font-family: 'Montserrat',sans-serif; font-size: 30px; font-weight: 700; line-height: 130%; text-align: center; word-wrap: break-word;\">\n" +
               "    <p style=\"line-height: 110%;\"><span style=\"color: #9d7cf4; line-height: 33px;\"></span></p>\n" +
               "<p style=\"line-height: 110%;\"><span style=\"color: #9d7cf4; line-height: 33px;\">Novedades</span></p>\n" +
               "  </div>\n" +
               "\n" +
               "      </td>\n" +
               "    </tr>\n" +
               "  </tbody>\n" +
               "</table>\n" +
               "\n" +
               "<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
               "  <tbody>\n" +
               "    <tr>\n" +
               "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:10px 10px 30px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\n" +
               "        \n" +
               "  <div class=\"v-line-height v-font-size\" style=\"font-size: 14px; line-height: 140%; text-align: center; word-wrap: break-word;\">\n" +
               "    <p style=\"line-height: 140%;\">" + nombre + " durante tu ausencia, se han producido novedades .</p>\n" +
               "<p style=\"line-height: 140%;\">Tu paquete " + numSeguimiento + " se encuentra " + estadoEnvio + ", se entregará en " + direccionEntrega + ", " + localidad + ",(" + provincia + "), a fecha de entrega " + fecha + " y va dirigido a " + nombre + "</p>\n" +
               "  </div>\n" +
               "\n" +
               "      </td>\n" +
               "    </tr>\n" +
               "  </tbody>\n" +
               "</table>\n" +
               "\n" +
               "</div>\n" +
               "  </div>\n" +
               "</div>\n" +
               "\n" +
               "    </div>\n" +
               "  </div>\n" +
               "  </div>\n" +
               "  \n" +
               "\n" +
               "\n" +
               "  \n" +
               "  \n" +
               "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
               "  <div class=\"u-row\" style=\"margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\">\n" +
               "    <div style=\"border-collapse: collapse;display: table;width: 100%;height: 100%;background-color: transparent;\">\n" +
               "      <div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
               "  <div style=\"background-color: #ffffff;height: 100%;width: 100% !important;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\">\n" +
               "<div style=\"box-sizing: border-box; height: 100%; padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\"><!--<![endif]-->\n" +
               "  \n" +
               "<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
               "  <tbody>\n" +
               "    <tr>\n" +
               "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:10px 10px 30px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\n" +
               "        \n" +
               "      <h1 class=\"v-line-height v-font-size\" style=\"margin: 0px; color: #9d7cf4; line-height: 140%; text-align: center; word-wrap: break-word; font-family: 'Montserrat',sans-serif; font-size: 22px; font-weight: 700;\"><span><span><span><span>Su paquete " + numSeguimiento + " está " + estadoEnvio + "</span></span></span></span></h1>\n" +
               "  \n" +
               "\n" +
               "      </td>\n" +
               "    </tr>\n" +
               "  </tbody>\n" +
               "</table>\n" +
               "\n" +
               "  \n" +
               "  </div>\n" +
               "</div>\n" +
               "\n" +
               "    </div>\n" +
               "  </div>\n" +
               "  </div>\n" +
               "  \n" +
               "\n" +
               "\n" +
               "  \n" +
               "  \n" +
               "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
               "  <div class=\"u-row\" style=\"margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\">\n" +
               "    <div style=\"border-collapse: collapse;display: table;width: 100%;height: 100%;background-color: transparent;\">\n" +
               "       <div class=\"u-col u-col-33p33\" style=\"max-width: 320px;min-width: 200px;display: table-cell;vertical-align: top;\">\n" +
               "  <div style=\"background-color: #ffffff;height: 100%;width: 100% !important;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\">\n" +
               " <div style=\"box-sizing: border-box; height: 100%; padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\"><!--<![endif]-->\n" +
               "  \n" +
               "<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
               "  <tbody>\n" +
               "    <tr>\n" +
               "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\n" +
               "        \n" +
               "<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n" +
               "  <tr>\n" +
               "    <td style=\"padding-right: 0px;padding-left: 0px;\" align=\"center\">\n" +
               "      \n" +
               "      <img align=\"center\" border=\"0\" src=\"https://i.ibb.co/H7JQX5d/image-1.png\" alt=\"image\" title=\"image\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: inline-block !important;border: none;height: auto;float: none;width: 36%;max-width: 64.8px;\" width=\"64.8\" class=\"v-src-width v-src-max-width\"/>\n" +
               "      \n" +
               "    </td>\n" +
               "  </tr>\n" +
               "</table>\n" +
               "\n" +
               "      </td>\n" +
               "    </tr>\n" +
               "  </tbody>\n" +
               "</table>\n" +
               "\n" +
               "<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
               "  <tbody>\n" +
               "    <tr>\n" +
               "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\n" +
               "        \n" +
               "\n" +
               "    <h1 class=\"v-line-height v-font-size\" style=\"margin: 0px; color: #9d7cf4; line-height: 140%; text-align: center; word-wrap: break-word; font-size: 18px; font-weight: 400;\"><span><span><strong>" + fecha + "</strong></span></span></h1>\n" +
               "\n" +
               "\n" +
               "      </td>\n" +
               "    </tr>\n" +
               "  </tbody>\n" +
               "</table>\n" +
               "\n" +
               "</div>\n" +
               "  </div>\n" +
               "</div>\n" +
               "<div class=\"u-col u-col-33p33\" style=\"max-width: 320px;min-width: 200px;display: table-cell;vertical-align: top;\">\n" +
               "  <div style=\"background-color: #ffffff;height: 100%;width: 100% !important;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\">\n" +
               "  <div style=\"box-sizing: border-box; height: 100%; padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\"><!--<![endif]-->\n" +
               "  \n" +
               "<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
               "  <tbody>\n" +
               "    <tr>\n" +
               "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:0px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\n" +
               "        \n" +
               "<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n" +
               "  <tr>\n" +
               "    <td style=\"padding-right: 0px;padding-left: 0px;\" align=\"center\">\n" +
               "      \n" +
               "      <img align=\"center\" border=\"0\" src=\"https://i.ibb.co/fnPPg4v/image-4.png\" alt=\"image\" title=\"image\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: inline-block !important;border: none;height: auto;float: none;width: 28%;max-width: 56px;\" width=\"56\" class=\"v-src-width v-src-max-width\"/>\n" +
               "      \n" +
               "    </td>\n" +
               "  </tr>\n" +
               "</table>\n" +
               "\n" +
               "      </td>\n" +
               "    </tr>\n" +
               "  </tbody>\n" +
               "</table>\n" +
               "\n" +
               "<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
               "  <tbody>\n" +
               "    <tr>\n" +
               "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\n" +
               "       \n" +
               "     <h1 class=\"v-line-height v-font-size\" style=\"margin: 0px; color: #9d7cf4; line-height: 140%; text-align: center; word-wrap: break-word; font-size: 18px; font-weight: 400;\"><span><span><strong>" + direccionEntrega + "</strong></span></span></h1>\n" +
               "  \n" +
               "\n" +
               "      </td>\n" +
               "    </tr>\n" +
               "  </tbody>\n" +
               "</table>\n" +
               "\n" +
               "</div>\n" +
               "  </div>\n" +
               "</div>\n" +
               "<div class=\"u-col u-col-33p33\" style=\"max-width: 320px;min-width: 200px;display: table-cell;vertical-align: top;\">\n" +
               "  <div style=\"background-color: #ffffff;height: 100%;width: 100% !important;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\">\n" +
               "  <div style=\"box-sizing: border-box; height: 100%; padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\"><!--<![endif]-->\n" +
               "  \n" +
               "<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
               "  <tbody>\n" +
               "    <tr>\n" +
               "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\n" +
               "        \n" +
               "<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n" +
               "  <tr>\n" +
               "    <td style=\"padding-right: 0px;padding-left: 0px;\" align=\"center\">\n" +
               "      \n" +
               "      <img align=\"center\" border=\"0\" src=\"https://i.ibb.co/ZKS7tYt/image-8.png\" alt=\"image\" title=\"image\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: inline-block !important;border: none;height: auto;float: none;width: 36%;max-width: 64.8px;\" width=\"64.8\" class=\"v-src-width v-src-max-width\"/>\n" +
               "      \n" +
               "    </td>\n" +
               "  </tr>\n" +
               "</table>\n" +
               "\n" +
               "      </td>\n" +
               "    </tr>\n" +
               "  </tbody>\n" +
               "</table>\n" +
               "\n" +
               "<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
               "  <tbody>\n" +
               "    <tr>\n" +
               "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\n" +
               "        \n" +
               "    <h1 class=\"v-line-height v-font-size\" style=\"margin: 0px; color: #9d7cf4; line-height: 140%; text-align: center; word-wrap: break-word; font-size: 18px; font-weight: 400;\"><span><span><span><strong>9 AM hasta 20 PM</strong></span></span></span></h1>\n" +
               "\n" +
               "\n" +
               "      </td>\n" +
               "    </tr>\n" +
               "  </tbody>\n" +
               "</table>\n" +
               "\n" +
               "\n" +
               "  </div>\n" +
               "</div>\n" +
               "\n" +
               "    </div>\n" +
               "  </div>\n" +
               "  </div>\n" +
               "  \n" +
               "\n" +
               "\n" +
               "  \n" +
               "  \n" +
               "<div class=\"u-row-container\" style=\"padding: 2px 0px 0px;background-color: transparent\">\n" +
               "  <div class=\"u-row\" style=\"margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\">\n" +
               "    <div style=\"border-collapse: collapse;display: table;width: 100%;height: 100%;background-color: transparent;\">\n" +
               "\n" +
               "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
               "  <div style=\"background-color: #ffffff;height: 100%;width: 100% !important;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\">\n" +
               "<div style=\"box-sizing: border-box; height: 100%; padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\"><!--<![endif]-->\n" +
               "  \n" +
               "<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
               "  <tbody>\n" +
               "    <tr>\n" +
               "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:30px 10px 10px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\n" +
               "        \n" +
               " \n" +
               "    <h1 class=\"v-line-height v-font-size\" style=\"margin: 0px; color: #9d7cf4; line-height: 140%; text-align: center; word-wrap: break-word; font-family: 'Montserrat',sans-serif; font-size: 22px; font-weight: 700;\"><span><span><span><span><span><span>Su paquete " + numSeguimiento + " está " + estadoEnvio + "</span></span></span></span></span></span></h1>\n" +
               "\n" +
               "\n" +
               "      </td>\n" +
               "    </tr>\n" +
               "  </tbody>\n" +
               "</table>\n" +
               "\n" +
               "</div>\n" +
               "  </div>\n" +
               "</div>\n" +
               "    </div>\n" +
               "  </div>\n" +
               "  </div>\n" +
               "  \n" +
               "\n" +
               "\n" +
               "  \n" +
               "  \n" +
               "<div class=\"u-row-container\" style=\"padding: 0px 0px 2px;background-color: transparent\">\n" +
               "  <div class=\"u-row\" style=\"margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\">\n" +
               "    <div style=\"border-collapse: collapse;display: table;width: 100%;height: 100%;background-color: transparent;\">\n" +
               "    \n" +
               "<div class=\"u-col u-col-50\" style=\"max-width: 320px;min-width: 300px;display: table-cell;vertical-align: top;\">\n" +
               "  <div style=\"background-color: #ffffff;height: 100%;width: 100% !important;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\">\n" +
               "  <div style=\"box-sizing: border-box; height: 100%; padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\">\n" +
               "  \n" +
               "<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
               "  <tbody>\n" +
               "    <tr>\n" +
               "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\n" +
               "        \n" +
               "<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n" +
               "  <tr>\n" +
               "    <td style=\"padding-right: 0px;padding-left: 0px;\" align=\"center\">\n" +
               "      \n" +
               "      <img align=\"center\" border=\"0\" src=\"https://i.ibb.co/BKchwMX/0ac7fa50-7340-4172-b1ac-9234e06e2baf-removebg-preview.png\" alt=\"image\" title=\"image\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: inline-block !important;border: none;height: auto;float: none;width: 100%;max-width: 280px;\" width=\"280\" class=\"v-src-width v-src-max-width\"/>\n" +
               "      \n" +
               "    </td>\n" +
               "  </tr>\n" +
               "</table>\n" +
               "\n" +
               "      </td>\n" +
               "    </tr>\n" +
               "  </tbody>\n" +
               "</table>\n" +
               "\n" +
               "<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
               "  <tbody>\n" +
               "    <tr>\n" +
               "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\n" +
               "        \n" +
               "\n" +
               "    <h1 class=\"v-line-height v-font-size\" style=\"margin: 0px; color: #9d7cf4; line-height: 140%; text-align: center; word-wrap: break-word; font-size: 18px; font-weight: 400;\"><span><span><span><span><strong></strong></span></span></span></span></h1>\n" +
               "\n" +
               "\n" +
               "      </td>\n" +
               "    </tr>\n" +
               "  </tbody>\n" +
               "</table>\n" +
               "\n" +
               " </div>\n" +
               "  </div>\n" +
               "</div>\n" +
               "\n" +
               "<div class=\"u-col u-col-50\" style=\"max-width: 320px;min-width: 300px;display: table-cell;vertical-align: top;\">\n" +
               "  <div style=\"background-color: #ffffff;height: 100%;width: 100% !important;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\">\n" +
               "<div style=\"box-sizing: border-box; height: 100%; padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\"><!--<![endif]-->\n" +
               "  \n" +
               "<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
               "  <tbody>\n" +
               "    <tr>\n" +
               "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\n" +
               "        \n" +
               "<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n" +
               "  <tr>\n" +
               "    <td style=\"padding-right: 0px;padding-left: 0px;\" align=\"center\">\n" +
               "      \n" +
               "      <img align=\"center\" border=\"0\" src=\"https://i.ibb.co/kymhXLt/d60fcacb-f2a6-43ee-a8b2-ecd2119a4dae-removebg-preview.png\" alt=\"image\" title=\"image\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: inline-block !important;border: none;height: auto;float: none;width: 100%;max-width: 280px;\" width=\"280\" class=\"v-src-width v-src-max-width\"/>\n" +
               "      \n" +
               "    </td>\n" +
               "  </tr>\n" +
               "</table>\n" +
               "\n" +
               "      </td>\n" +
               "    </tr>\n" +
               "  </tbody>\n" +
               "</table>\n" +
               "\n" +
               "<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
               "  <tbody>\n" +
               "    <tr>\n" +
               "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\n" +
               "        \n" +
               "\n" +
               "    <h1 class=\"v-line-height v-font-size\" style=\"margin: 0px; color: #9d7cf4; line-height: 140%; text-align: center; word-wrap: break-word; font-size: 18px; font-weight: 400;\"><span><span><span><span><span><span><strong></strong></span></span></span></span></span></span></h1>\n" +
               "\n" +
               "\n" +
               "      </td>\n" +
               "    </tr>\n" +
               "  </tbody>\n" +
               "</table>\n" +
               "\n" +
               "\n" +
               "  </div>\n" +
               "</div>\n" +
               "\n" +
               "    </div>\n" +
               "  </div>\n" +
               "  </div>\n" +
               "  \n" +
               "\n" +
               "\n" +
               "  \n" +
               "  \n" +
               "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
               "  <div class=\"u-row\" style=\"margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\">\n" +
               "    <div style=\"border-collapse: collapse;display: table;width: 100%;height: 100%;background-color: transparent;\">\n" +
               "     \n" +
               "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
               "  <div style=\"background-color: #ffffff;height: 100%;width: 100% !important;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\">\n" +
               "<div style=\"box-sizing: border-box; height: 100%; padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\"><!--<![endif]-->\n" +
               "  \n" +
               "<table id=\"u_content_heading_13\" style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
               "  <tbody>\n" +
               "    <tr>\n" +
               "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\n" +
               "        \n" +
               "  \n" +
               "    <h1 class=\"v-line-height v-font-size\" style=\"margin: 0px; color: #000000; line-height: 140%; text-align: center; word-wrap: break-word; font-family: 'Montserrat',sans-serif; font-size: 18px; font-weight: 700;\"><span style=\"line-height: 21.6px;\"><span style=\"line-height: 21.6px;\">" + nombre + " no te pierdas las novedades<br />que FernanPaaq tiene preparadas para ti</span></span></h1>\n" +
               "\n" +
               "\n" +
               "      </td>\n" +
               "    </tr>\n" +
               "  </tbody>\n" +
               "</table>\n" +
               "\n" +
               "<table id=\"u_content_text_4\" style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
               "  <tbody>\n" +
               "    <tr>\n" +
               "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\n" +
               "        \n" +
               "  <div class=\"v-line-height v-font-size\" style=\"font-size: 14px; line-height: 140%; text-align: center; word-wrap: break-word;\">\n" +
               "    <p style=\"line-height: 140%;\">No pierdas las últimas novedades de tu paquete e inicia sesión en nuestra app FernanPaaq</p>\n" +
               "<p style=\"line-height: 140%;\">¡Pronto estaremos en tu hogar! </p>\n" +
               "  </div>\n" +
               "\n" +
               "      </td>\n" +
               "    </tr>\n" +
               "  </tbody>\n" +
               "</table>\n" +
               "\n" +
               "<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
               "  <tbody>\n" +
               "    <tr>\n" +
               "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\n" +
               "        \n" +
               " \n" +
               "<div align=\"center\">\n" +
               "    <a href=\"\" target=\"_blank\" class=\"v-button v-font-size\" style=\"box-sizing: border-box;display: inline-block;text-decoration: none;-webkit-text-size-adjust: none;text-align: center;color: #FFFFFF; background-color: #582f9e; border-radius: 4px;-webkit-border-radius: 4px; -moz-border-radius: 4px; width:56%; max-width:100%; overflow-wrap: break-word; word-break: break-word; word-wrap:break-word; mso-border-alt: none;font-size: 14px;\">\n" +
               "      <span class=\"v-line-height v-padding\" style=\"display:block;padding:10px 20px;line-height:120%;\"><span style=\"line-height: 16.8px;\">Sigue tu paquete</span></span>\n" +
               "    </a>\n" +
               "\n" +
               "</div>\n" +
               "\n" +
               "      </td>\n" +
               "    </tr>\n" +
               "  </tbody>\n" +
               "</table>\n" +
               "\n" +
               " </div>\n" +
               "  </div>\n" +
               "</div>\n" +
               "\n" +
               "    </div>\n" +
               "  </div>\n" +
               "  </div>\n" +
               "  \n" +
               "\n" +
               "\n" +
               "  \n" +
               "  \n" +
               "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
               "  <div class=\"u-row\" style=\"margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\">\n" +
               "    <div style=\"border-collapse: collapse;display: table;width: 100%;height: 100%;background-color: transparent;\">\n" +
               "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: transparent;\"><![endif]-->\n" +
               "      \n" +
               "<!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"background-color: #ffffff;width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\" valign=\"top\"><![endif]-->\n" +
               "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
               "  <div style=\"background-color: #ffffff;height: 100%;width: 100% !important;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\">\n" +
               "  <!--[if (!mso)&(!IE)]><!--><div style=\"box-sizing: border-box; height: 100%; padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\"><!--<![endif]-->\n" +
               "  \n" +
               "<table id=\"u_content_image_9\" style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
               "  <tbody>\n" +
               "    <tr>\n" +
               "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:60px 10px 18px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\n" +
               "        \n" +
               "<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n" +
               "  <tr>\n" +
               "    <td style=\"padding-right: 0px;padding-left: 0px;\" align=\"center\">\n" +
               "      \n" +
               "      <img align=\"center\" border=\"0\" src=\"https://i.ibb.co/B3MJxhh/logo-fernanpaaq.jpg\" alt=\"image\" title=\"image\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: inline-block !important;border: none;height: auto;float: none;width: 11%;max-width: 63.8px;\" width=\"63.8\" class=\"v-src-width v-src-max-width\"/>\n" +
               "      \n" +
               "    </td>\n" +
               "  </tr>\n" +
               "</table>\n" +
               "\n" +
               "      </td>\n" +
               "    </tr>\n" +
               "  </tbody>\n" +
               "</table>\n" +
               "\n" +
               "<table id=\"u_content_social_1\" style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
               "  <tbody>\n" +
               "    <tr>\n" +
               "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:15px 10px 10px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\n" +
               "        \n" +
               "<div align=\"center\">\n" +
               "  <div style=\"display: table; max-width:167px;\">\n" +
               "  <!--[if (mso)|(IE)]><table width=\"167\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"border-collapse:collapse;\" align=\"center\"><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-collapse:collapse; mso-table-lspace: 0pt;mso-table-rspace: 0pt; width:167px;\"><tr><![endif]-->\n" +
               "  \n" +
               "    \n" +
               "    <!--[if (mso)|(IE)]><td width=\"32\" style=\"width:32px; padding-right: 10px;\" valign=\"top\"><![endif]-->\n" +
               "    <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"width: 32px !important;height: 32px !important;display: inline-block;border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;margin-right: 10px\">\n" +
               "      <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
               "        <a href=\"https://www.facebook.com\" title=\"Facebook\" target=\"_blank\">\n" +
               "          <img src=\"https://i.ibb.co/J2RD1X4/image-1.png\" alt=\"Facebook\" title=\"Facebook\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
               "        </a>\n" +
               "      </td></tr>\n" +
               "    </tbody></table>\n" +
               "    <!--[if (mso)|(IE)]></td><![endif]-->\n" +
               "    \n" +
               "    <!--[if (mso)|(IE)]><td width=\"32\" style=\"width:32px; padding-right: 10px;\" valign=\"top\"><![endif]-->\n" +
               "    <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"width: 32px !important;height: 32px !important;display: inline-block;border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;margin-right: 10px\">\n" +
               "      <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
               "        <a href=\"https://x.com/_ahmedlb?t=lpRhv7-gRweGIk-u0gTOFA&s=08\" title=\"Twitter\" target=\"_blank\">\n" +
               "          <img src=\"https://i.ibb.co/j5CCYnk/image-5.png\" alt=\"Twitter\" title=\"Twitter\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
               "        </a>\n" +
               "      </td></tr>\n" +
               "    </tbody></table>\n" +
               "    <!--[if (mso)|(IE)]></td><![endif]-->\n" +
               "    \n" +
               "    <!--[if (mso)|(IE)]><td width=\"32\" style=\"width:32px; padding-right: 10px;\" valign=\"top\"><![endif]-->\n" +
               "    <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"width: 32px !important;height: 32px !important;display: inline-block;border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;margin-right: 10px\">\n" +
               "      <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
               "        <a href=\"https://www.linkedin.com\" title=\"LinkedIn\" target=\"_blank\">\n" +
               "          <img src=\"https://i.ibb.co/V9KbCbY/image-2.png\" alt=\"LinkedIn\" title=\"LinkedIn\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
               "        </a>\n" +
               "      </td></tr>\n" +
               "    </tbody></table>\n" +
               "    <!--[if (mso)|(IE)]></td><![endif]-->\n" +
               "    \n" +
               "    <!--[if (mso)|(IE)]><td width=\"32\" style=\"width:32px; padding-right: 0px;\" valign=\"top\"><![endif]-->\n" +
               "    <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"width: 32px !important;height: 32px !important;display: inline-block;border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;margin-right: 0px\">\n" +
               "      <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
               "        <a href=\"https://www.instagram.com/maariiaa191/?hl=es\" title=\"Instagram\" target=\"_blank\">\n" +
               "          <img src=\"https://i.ibb.co/1nGpTj8/image-2.png\" alt=\"Instagram\" title=\"Instagram\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
               "        </a>\n" +
               "      </td></tr>\n" +
               "    </tbody></table>\n" +
               "    <!--[if (mso)|(IE)]></td><![endif]-->\n" +
               "    \n" +
               "    \n" +
               "    <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
               "  </div>\n" +
               "</div>\n" +
               "\n" +
               "      </td>\n" +
               "    </tr>\n" +
               "  </tbody>\n" +
               "</table>\n" +
               "\n" +
               "<table id=\"u_content_text_5\" style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
               "  <tbody>\n" +
               "    <tr>\n" +
               "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:10px 100px 60px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\n" +
               "        \n" +
               "  <div class=\"v-line-height v-font-size\" style=\"font-size: 14px; color: #000000; line-height: 170%; text-align: center; word-wrap: break-word;\">\n" +
               "    <p style=\"font-size: 14px; line-height: 170%;\"><strong>DARSE DE BAJA   |   POLITICAS DE PRIVACIDAD   |   WEB</strong></p>\n" +
               "<p style=\"font-size: 14px; line-height: 170%;\"> </p>\n" +
               "<p style=\"font-size: 14px; line-height: 170%;\">Todos sus datos quedan guardados seguramente en este correo, si recibe un correo con nuestro logo, por favor, asegurese de que se lo enviamos desde el email fernanPaaq@fernanpaaq.com, cualquier otro sería una estafa. No nos hacemos responsables si te engañan </p>\n" +
               "  </div>\n" +
               "\n" +
               "      </td>\n" +
               "    </tr>\n" +
               "  </tbody>\n" +
               "</table>\n" +
               "\n" +
               "<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
               "  <tbody>\n" +
               "    <tr>\n" +
               "      <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:0px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\n" +
               "        \n" +
               "  <table height=\"0px\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 1px solid #BBBBBB;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
               "    <tbody>\n" +
               "      <tr style=\"vertical-align: top\">\n" +
               "        <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;font-size: 0px;line-height: 0px;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
               "          <span>&#160;</span>\n" +
               "        </td>\n" +
               "      </tr>\n" +
               "    </tbody>\n" +
               "  </table>\n" +
               "      </td>\n" +
               "    </tr>\n" +
               "  </tbody>\n" +
               "</table>\n" +
               "</div>\n" +
               "  </div>\n" +
               "</div>\n" +
               "    </div>\n" +
               "  </div>\n" +
               "  </div>\n" +
               "     </td>\n" +
               "  </tr>\n" +
               "  </tbody>\n" +
               "  </table>\n" +
               "</body>\n" +
               "</html>";

    }
}
