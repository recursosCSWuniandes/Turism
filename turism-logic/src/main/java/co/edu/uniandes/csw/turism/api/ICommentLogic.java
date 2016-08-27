/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.turism.api;

import co.edu.uniandes.csw.turism.entities.CommentEntity;
import java.util.List;

/**
 *
 * @author da.prieto1
 */
public interface ICommentLogic {

    public int countComments();

    public List<CommentEntity> getComments();

    public List<CommentEntity> getComments(Integer page, Integer maxRecords);

    public CommentEntity getComment(Long id);

    public CommentEntity createComment(Long clientId, Long tripId, CommentEntity entity);

    public CommentEntity updateComment(CommentEntity entity);

    public void deleteComment(Long id);
}
