import React from 'react'
import ArticlePage from '../pages/ArticlePage'
import CommunityPage from '../pages/CommunityPage'
import { Route, Router } from "react-router";
import {Container} from 'react-bootstrap'

export default function Dashboard() {
  return (
    <div>
        <Container>
        
            <ArticlePage/>
           
          
      </Container>
    </div>
  )
}
