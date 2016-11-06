/*
The MIT License (MIT)

Copyright (c) 2015 Los Andes University

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
package co.edu.uniandes.csw.turism.dtos.minimum;

import co.edu.uniandes.csw.turism.entities.NewsEntity;
import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dp.espitia
 */
@XmlRootElement
public class NewsDTO implements Serializable{
    
    private Long id;
    private String name;
    private String content;
    private Date date;
    
    /**
     * Constructor de la clase DTO mínima
     */
    public NewsDTO(){
         super();
    }

    /**
     * 
     * @param entity 
     */
    public NewsDTO(NewsEntity entity) {
        if (entity!=null){
            this.id = entity.getId();
            this.name = entity.getName();
            this.content = entity.getContent();
            this.date = entity.getDate();
        }
    }
    
    /**
     * Convierte un objeto NewsDTO a NewsEntity.
     *
     * @return Nuevo objeto NewsEntity.
     * @generated
     */
    public NewsEntity toEntity() {
        NewsEntity entity = new NewsEntity();
        entity.setId(this.getId());
        entity.setName(this.getName());
        entity.setContent(this.getContent());
 	entity.setDate(this.getDate());    
    return entity;
    }
    
    
     public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
     public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
