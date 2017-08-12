/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controladores;

import com.sv.udb.modelo.Personas;
import com.sv.udb.recursos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class PersonasCtrl {
    public List<Personas> consTodo()
    {
       List<Personas> resp = new ArrayList();
       Connection cn = new Conexion().getConn();
        try
        {
            PreparedStatement cmd = cn.prepareStatement("SELECT pers.CODI_PERS, pers.NOMB_PERS, pers.APEL_PERS, pers.FOTO_PERS, pers.CODI_TIPO_PERS,pers.mail_pers, pers.GENE_PERS, pers.FECH_NACI_PERS, DUI_PERS, NIT_PERS, TIPO_SANG_PERS, pers.CODI_UBIC_GEOG, pers.FECH_ALTA, pers.FECH_BAJA, pers.ESTA FROM pers,tipo_pers,ubic_geog WHERE tipo_pers.CODI_TIPO_PERS = pers.CODI_TIPO_PERS and ubic_geog.CODI_UBIC_GEOG = pers.CODI_UBIC_GEOG");
            ResultSet rs = cmd.executeQuery();
            while(rs.next())
            {
                resp.add(new Personas
        (rs.getInt(1),rs.getString(2),rs.getString(3),rs.getBytes(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getInt(12),rs.getString(13),rs.getString(14),rs.getInt(15)));
            }
            //Se carga el 
        }
        catch(Exception err)
        {
            err.printStackTrace();
        }
        finally
        {
            try
            {
                if(cn!=null)
                {
                    if(!cn.isClosed())
                    {
                        cn.close();
                    }
                }
            }
            catch(SQLException err)
            {
                err.printStackTrace();
            }
        }
        return resp;
    } 
}
