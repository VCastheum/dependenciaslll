package com.mycompany.objetopersistencia_228559;

import com.mycompany.objetopersistencia_228559.CustomExceptions.Exceptions;
import com.mycompany.objetosservicio_228559.ConsecutiveCodeGenerator;
import com.mycompany.objetosservicio_228559.RandomCodeGenerator;
import java.util.HashMap;
import objetosDominio.MaterialDigital;
import objetosDominio.Material;
import objetosDominio.MaterialFisico;
import objetosDominio.Movimiento;
import objetosDominio.MovimientoDigital;
import objetosDominio.MovimientoFisico;
/**
 *
 * @author Castheum
 */
public class MaterialMaps {
    public HashMap<String, MaterialDigital> mateDigi = new HashMap<>();
    public HashMap<String, MaterialFisico> mateFisi = new HashMap<>();
    HashMap<String,Material> mate = new HashMap<>();
    ConsecutiveCodeGenerator genConse = new ConsecutiveCodeGenerator();
    RandomCodeGenerator genRando = new RandomCodeGenerator();
    HashMap<String,MovimientoDigital> moveDigi = new HashMap<>();
    HashMap<String,MovimientoFisico> moveFisi = new HashMap<>();
    public void newMaterial(String key,String title, String type, String format, float quantity) throws Exceptions{
        type=type.toUpperCase();
        format=format.toUpperCase();
        if(!mateDigi.containsKey(key)&&!mateFisi.containsKey(key)){
            if(type.contains("D")){
                if(format.contains("PDF")||format.contains("EPUB")||format.contains("VID")){
                    Material tempo = new Material(key,title,type,format,quantity);
                    mateDigi.put(genConse.prefixGenera("DI"), new MaterialDigital(tempo));
                    return;
                }throw new Exceptions("Formato invalido");
            }else{
                if(type.toUpperCase().contains("F")){
                    if(format.contains("IMP")){
                        Material tempo = new Material(key,title,type,format,quantity);
                        mateFisi.put(genConse.prefixGenera("FI"), new MaterialFisico(tempo));
                        return;
                    }throw new Exceptions("Formato Invalido");
                }
            } throw new Exceptions("Tipo Invalido");
        }
    }
    
    public void printAll(){
        System.out.println("Materiales Digitales");
        for(String key : mateDigi.keySet()){
            System.out.println(mateDigi.get(key));
        }
        System.out.println("Materiales Fisicos");
        for(String key : mateFisi.keySet()){
            System.out.println(mateFisi.get(key));
        }
    }
    public Material searchMaterialByKey(String key) throws Exception{
        if(mateDigi.containsKey(key)){
            return mateDigi.get(key);
        }
        if(mateFisi.containsKey(key)){
            return mateFisi.get(key);
        }throw new Exception("Material no encontrado");
    }
    public void searchMaterialByType(String type){
        for(String key : mateFisi.keySet()){
            if(mateFisi.get(key).getTypeMaterial().contains(type)){
                System.out.println(mateFisi.get(key));
            }   
        }
        for(String key : mateDigi.keySet()){
            if(mateDigi.get(key).getTypeMaterial().contains(type)){
                System.out.println(mateDigi.get(key));
            }   
        }
    }
    
    public void modifyDigiTitle(String key,String title) throws Exception{
        if(title!=null){
            mateDigi.get(key).setTitle(title);
            return;
        }throw new Exception("Titulo Vacio");
    }
    public void modifyDigiFormat(String key,String format) throws Exception{
        if(format!=null){
            if(format.contains("IMP")){
                mateDigi.get(key).setFormat(format);
                return;
            }throw new Exception("Formato invalido");
        }throw new Exception("Formato Vacio");
    }
    public void modifyDigiQuanti(String key,float quantity) throws Exception{
            mateDigi.get(key).setQuantity(quantity);
            if(quantity==0){
                throw new Exception("Se ajusto a 0");
            }
    }
    public void modifyFisiTitle(String key, String title) throws Exception {
    if (title != null) {
        mateFisi.get(key).setTitle(title);
        return;
    }
    throw new Exception("Titulo Vacio");
}

    public void modifyFisiFormat(String key, String format) throws Exception {
        if (format != null) {
            if (format.contains("PDF") || format.contains("EPUB") || format.contains("VID")) {
                mateFisi.get(key).setFormat(format);
                return;
            }
            throw new Exception("Formato invalido");
        }
        throw new Exception("Formato Vacio");
    }

    public void modifyFisiQuanti(String key, float quantity) throws Exception {
        mateFisi.get(key).setQuantity(quantity);
        if (quantity == 0) {
            throw new Exception("Se ajusto a 0");
        }
    }
    public void deleteMaterial(String key, String type) throws Exception{
        if(type.matches("D")&&mateDigi.containsKey(key)){
            mateDigi.remove(key);
            return;
        }
        if(type.matches("F")&&mateFisi.containsKey(key)){
            mateFisi.remove(key);
            return;
        }
        throw new Exception ("Material no existe");
    }
    public void newDigitalMovement(String keyMate){
        
        
    }
}
