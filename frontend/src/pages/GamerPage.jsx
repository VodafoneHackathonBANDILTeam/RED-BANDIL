import React, { useEffect, useState } from 'react'
import GamerService from '../services/gamerService';

export default function GamerPage() {
    let [gamers,setGamer]=useState([])
  
    useEffect(() => {
      
      let gamerService=new GamerService();
      gamerService.getAll().then(result=>setGamer(result.data)).catch(e=>console.log(e))
    },[]);
  return (
    <div>
        {gamers.map((gamer=>
            <li>{gamer.username}</li>
            ))}
        

    </div>
  )
}
