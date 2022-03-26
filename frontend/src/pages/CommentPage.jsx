import React, { useEffect, useState } from 'react'
import CommentService from '../services/commentService';

export default function CommentPage() {
    let [comments,setComments]=useState([])
  
  useEffect(() => {
    
    let commentService=new CommentService();
    commentService.getComments().then(result=>setComments(result.data)).catch(e=>console.log(e))
    console.log(comments)
    
  },[]);
  return (
    <div>
        {comments.map((comment=>
            <li>{comment.comment}</li>
            ))}
        

    </div>
  )
}
