/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 *
 * @author Happy-2001
 */
@Data
@Builder
@ToString
@Getter
@Setter
public class Category {
    public int id;
    public String name;
    
    
    
}
