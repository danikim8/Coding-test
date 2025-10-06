function solution(cacheSize, cities) {
    //LRU, hit=1, miss=5
    if (cacheSize === 0) return 5 * cities.length;
    
    let cache = [];
    let time = 0;
    
    for (let city of cities){
        city = city.toLowerCase();
        const index = cache.indexOf(city);
        
        if (index !== -1) {
            //hit
            cache.splice(index, 1);
            cache.push(city);
            time += 1;
        } else { //miss
            if (cache.length >= cacheSize){ //꽉 찻음!
                cache.shift(); //오래된 도시 제거, LRU
            }
            cache.push(city);
            time += 5;
        }
    }
    return time;
}