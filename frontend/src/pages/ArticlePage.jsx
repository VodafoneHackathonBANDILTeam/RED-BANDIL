import React, { useEffect, useState } from 'react'
import { Alert, Button, Card, Carousel, Container } from 'react-bootstrap';
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
      src="https://www.bilisimdergisi.org.tr/wp-content/uploads/2017/07/Vodafone_hi_2.jpg"
      alt="First slide"
    />
    <Carousel.Caption>
    
    </Carousel.Caption>
  </Carousel.Item>
  <Carousel.Item>
    <img
      className="d-block w-100"
      src="https://i4.hurimg.com/i/hurriyet/75/1200x675/5e37e5c37152d810cca5b973.jpg"
      alt="Second slide"
    />

    <Carousel.Caption>
  
      </Carousel.Caption>
    </Carousel.Item>
    <Carousel.Item>
      <img
        className="d-block w-100"
      src="https://www.gursesgazetesi.com/images/haberler/2019/08/vodafone-freezone-avantajlari-nelerdir.jpg"
      alt="Third slide"
    />

      <Carousel.Caption>
        
      </Carousel.Caption>
    </Carousel.Item>
  </Carousel>
      <Container>
        
      
      {articles.map((article=>
        <Card>
        <Card.Header as="h5">{article.article}</Card.Header>
        <Card.Body>
          <Card.Title> {article.article} </Card.Title>
          <Card.Text>
            With supporting text below as a natural lead-in to additional content.
          </Card.Text>
          <Button variant="primary">Makaleye git</Button>
        </Card.Body>
      </Card>
      ))}
      </Container>
        

     
  

        

    </div>
  )
}
