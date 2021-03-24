let send = new function (name,surname){
    let xhr = new XMLHttpRequest();
    let param = 'name='+name+'&surname='+surname;
    xhr.open("GET",'/userList?'+param, true);
    xhr.send();
}