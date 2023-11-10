//Program to identify if a charater is a alphabet or not . 

function isAplhabet( char ){
     const regex = /^[a-zA-Z]$/;  
     return regex.test(char) ;
}

const user = prompt("Enter a character : ");

if (user !== null){

    if(user.length == 1 ){
             if(isAplhabet(user)){
                   console.log(`${user} is an alphabet`);
             } else {
                   console.log(`${user } is not an alphabet `);
             }
    } else {
            console.log( `${user} should have onle one character`);
    }     
} else {
       
      console.log(`${user} should not be null`);
}