<<<<<<< HEAD
var arr1 = [1,2,3,4,5];
var arr2 = [6,7,8,9,6,7];
var temp;

console.log("Array= "+ arr1);
console.log("Array append="+ arr2);


function every_func(element,index,array){ 
	return element > 4 ; 
}

function filter_func(element,index,array){
 return element < 4; 
}

function forEach_func(a){
	console.log(a*2);
}

function map_func(element,index,array){
 return ++element;
}

function reduce_func(res,val){ 
	return res+val; 
}

function some_func(a){
	return a>7;
}

console.log("concat() = " + arr1.concat(arr2));

console.log("every() = " + arr1.every(every_func));

console.log("filter() = " + arr1.filter(filter_func));

console.log("forEach() = " + arr1.forEach(forEach_func));

console.log("indexOf() = " + arr1.indexOf(4));

console.log("join() = " + arr1.join());

console.log("lastIndexOf() = " + arr2.lastIndexOf(6));

console.log("map() = " + arr2.map(map_func));

temp = arr2.pop();
console.log("popped item = " + temp);

arr2.push(5);
console.log("Array after push = " + arr2);

temp = arr2.reduce(reduce_func);
console.log("reduce() = " + temp);

temp = arr2.reduceRight(reduce_func);
console.log("reduceRight() = " + temp);

console.log("reverse() = " + arr2.reverse());

arr1.shift(1);
console.log("shift() = " + arr1);

console.log("slice() = " + arr2.slice(2,3));

console.log("some() = " + arr2.some(some_func));

console.log("sort() = " + arr2.sort());

console.log("splice() = " + arr1.splice(2,5));

console.log("toString() = " + arr1.toString());

arr1.unshift(0);
console.log("unshift() = " + arr1);

=======
var arr1 = [1,2,3,4,5];
var arr2 = [6,7,8,9,6,7];
var temp;

console.log("Array= "+ arr1);
console.log("Array append="+ arr2);


function every_func(element,index,array){ 
	return element > 4 ; 
}

function filter_func(element,index,array){
 return element < 4; 
}

function forEach_func(a){
	console.log(a*2);
}

function map_func(element,index,array){
 return ++element;
}

function reduce_func(res,val){ 
	return res+val; 
}

function some_func(a){
	return a>7;
}

console.log("concat() = " + arr1.concat(arr2));

console.log("every() = " + arr1.every(every_func));

console.log("filter() = " + arr1.filter(filter_func));

console.log("forEach() = " + arr1.forEach(forEach_func));

console.log("indexOf() = " + arr1.indexOf(4));

console.log("join() = " + arr1.join());

console.log("lastIndexOf() = " + arr2.lastIndexOf(6));

console.log("map() = " + arr2.map(map_func));

temp = arr2.pop();
console.log("popped item = " + temp);

arr2.push(5);
console.log("Array after push = " + arr2);

temp = arr2.reduce(reduce_func);
console.log("reduce() = " + temp);

temp = arr2.reduceRight(reduce_func);
console.log("reduceRight() = " + temp);

console.log("reverse() = " + arr2.reverse());

arr1.shift(1);
console.log("shift() = " + arr1);

console.log("slice() = " + arr2.slice(2,3));

console.log("some() = " + arr2.some(some_func));

console.log("sort() = " + arr2.sort());

console.log("splice() = " + arr1.splice(2,5));

console.log("toString() = " + arr1.toString());

arr1.unshift(0);
console.log("unshift() = " + arr1);

>>>>>>> b5515d0... Adv Java
