<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,intial-scale=1" />
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<title>Register New User</title>
</head>
<body>
	
    <div class="container">
    	
    
                <div class="row">
                    
                    
                    <div class="col-md-6">
                        <h2> Not yet registered</h2>
                        <hr/>
                        
                        <form:form class="form-horizontal" action="user" modelAttribute="user" method="post">
                        
                        	<div class="form-group">
					                <legend>Register</legend>
					            </div>
					            
                            <div class="form-group">
                                <label class="control-label col-md-2" for="firstname">Firstname</label>
                                <div class="col-md-6">
                                    <form:input type="text" path="firstname" name="firstname" class="form-control" id="firstname" 
                                    placeholder="Enter your first name"/>

                                </div>
                            </div>
                            
                            <div class="form-group">
                                <label class="control-label col-md-2" for="lastname"> Lastname</label>
                                <div class="col-md-6">
                                    <form:input type="text" path="lastname" name="lastname" class="form-control" id="lastname" 
                                    placeholder="Enter your last name"/>

                                </div>
                            </div>
                            
                            
                            <div class="form-group">
                                    <label class="control-label col-md-2" for="email">Email</label>
                                    <div class="col-md-6">
                                        <form:input type="email" path="email" name="email" class="form-control" id="email" 
                                        placeholder="Enter your email"/>
    
                                    </div>
                            </div>

                            <div class="form-group">
                                    <label class="control-label col-md-2" for="password">Password</label>
                                    <div class="col-md-6">
                                        <form:input type="password" path="password" name="password" class="form-control" id="password" placeholder="Enter a password"/>
    
                                    </div>
                            </div>

                            <div class="form-group">
                                    <label class="control-label col-md-4" for="confirm">Confirm Password</label>
                                    <div class="col-md-6">
                                        <input type="password" name="confirm" class="form-control" id="confirm" placeholder="Confirm your password"/>
    
                                    </div>
                            </div>

                           
                              <div class="col-md-10 col-md-offset-2">
                              
                                    <input type="submit" class="btn btn-primary" value="Register"/>
                               </div>
    
                                    
                            </div>

                        </form:form>
                    

                    <div class="col-md-6">
                        <h2>Already have an account</h2>
                        <hr/>
                        
                        <form:form class="form-horizontal" action="login" method="post">
                              
                              <div class="form-group">
					                <legend>Sign-in</legend>
					            </div>
                              
                             <div class="form-group" >
                                        <label class="control-label col-md-2" for="email">Email</label>
                                        <div class="col-md-6">
                                            <input type="email" name="email" class="form-control" />
                                            
                                        </div>
                                </div>
    
                                <div class="form-group">
                                        <label class="control-label col-md-2" for="password">Password</label>
                                        <div class="col-md-6">
                                            <input type="password" name="password" class="form-control"/>
        
                                        </div>
                                </div>
                                
                                 <div>${msg}</div>

                                <div class="col-md-10 col-md-offset-2">
                           
                                        <input type="submit" class="btn btn-primary" value="Sign-in"/>
                                </div>
        
                                        
                                
    
                            </form:form>
                        <hr/>
                    </div>
                    
                </div>
            </div>
            
            
</body>
</html>