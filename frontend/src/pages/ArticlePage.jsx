import React, { useEffect, useState } from 'react'
import { Alert, Button, Carousel } from 'react-bootstrap';
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
      <Carousel fade>
  <Carousel.Item>
    <img
      className="d-block w-100"
      src="holder.js/800x400?text=First slide&bg=373940"
      alt="First slide"
    />
    <Carousel.Caption>
      <h3>First slide label</h3>
      <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
    </Carousel.Caption>
  </Carousel.Item>
  <Carousel.Item>
    <img
      className="d-block w-100"
      src="holder.js/800x400?text=Second slide&bg=282c34"
      alt="Second slide"
    />

    <Carousel.Caption>
      <h3>Second slide label</h3>
      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
      </Carousel.Caption>
    </Carousel.Item>
    <Carousel.Item>
      <img
        className="d-block w-100"
      src="holder.js/800x400?text=Third slide&bg=20232a"
      alt="Third slide"
    />

      <Carousel.Caption>
        <h3>Third slide label</h3>
        <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur.</p>
      </Carousel.Caption>
    </Carousel.Item>
  </Carousel>
      {articles.map((article=>
        <Alert  variant="success">
        <Alert.Heading>How's it going?!</Alert.Heading>
        <p>
          {article.article}
        </p>
        <hr />
        Lorem ipsum dolor sit amet consectetur adipisicing elit. Itaque iusto, sequi ad dolorem aliquam perferendis ipsa sint aliquid temporibus cupiditate molestias nobis eos at incidunt nemo quae quam consequuntur sit!
        <div className="d-flex justify-content-end">
          
          <Button variant="outline-success">
            tıkla
          </Button>
        </div>
      </Alert>
      ))}
        

     
  

        

    </div>
  )
}
