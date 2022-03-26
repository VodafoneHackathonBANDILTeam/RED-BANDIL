import React, { useEffect, useState } from 'react'
import ArticleService from '../services/articleService';

export default function ArticlePage() {
    let [articles,setarticles]=useState([])
  
  useEffect(() => {
    
    let articleService=new ArticleService();
    articleService.getArticles().then(result=>setarticles(result.data)).catch(e=>console.log(e))
    console.log(articles)
    
  },[]);
  return (
    <div>
        {articles.map((article=>
            <li>{article.article}</li>
            ))}
        

    </div>
  )
}
