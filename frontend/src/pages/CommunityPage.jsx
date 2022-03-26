import React, { useEffect, useState } from 'react'
import CommunityService from '../services/communityService';

export default function CommunityPage() {
    let [communities,setCommunities]=useState([])
  
    useEffect(() => {
      
      let communityService=new CommunityService();
      communityService.getCommunites().then(result=>setCommunities(result.data)).catch(e=>console.log(e))
      console.log(communities)
    },[]);
  return (
    <div>
        {communities.map((community=>
            <li>{community.name}</li>
            ))}
        

    </div>
  )
}
