## Hello Everyone! 👋🏻

<h1 align="center">
	<img src="https://readme-typing-svg.demolab.com/?lines=Now+we+will+consider;the+integration+of+ELK+stack;with+spring+boot+application">
</h1>

1. Firstly, go into the ELK folder and open a terminal there. 
   Enter the command in the terminal. 
   This command starts the docker containers imported in the docker-compose.yml file:
   
       .../ELK$ docker-compose up
<hr>

2. Make sure elasticsearch is running through Chrome or FireFox web browsers:
       
       http://localhost:9200  

<hr>      

3. Make sure Kibana is also running in Chrome or FireFox web browsers:

       http://localhost:5601
   
<hr>

4. Change the server port given in the application.properties file to your convenience:

       server.port=YOUR_SERVER_POST
<hr>

5. Run the spring boot application.

<hr>

6. Send requests to the spring boot application APIs running through Chrome or FireFox web browsers 
   and view the logs among the spring boot application logs.

<hr>

7. Analyze spring boot application logs with kibana