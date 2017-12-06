
<style>
	.wrapper {
		max-width: 620px;
		height: auto;
	}
	
	.box {
		display: inline-block;
		position: relative;
		width: 150px;
		height: 150px;
		background: #FCC;
		z-index: 0;
		margin: 2px 2px 2px -2px;	
		transition: all .15s ease-in-out;
	}
	
	.box:hover {
		background: #9CC;
		position: absolute;
		z-index: 100 !important;
		transform: scale(1.5,1.5);
		box-shadow: 0 5px 10px 0 rgba(0,0,0,.2);
	}
</style>
<h2 style="color:blue;">Fun @ MS...</h2>


<ul class="wrapper">
	<li class="box">Start FUN from here</li>
    <li class="box">2</li>
    <li class="box">3</li>
    <li class="box">4</li>
    <li class="box">5</li>
    <li class="box">Fun unlimited....</li>
</ul>




