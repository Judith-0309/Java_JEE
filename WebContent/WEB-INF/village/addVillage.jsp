<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../../header.jsp"></jsp:include>
<!-- Content Row -->

<div class="row">

    <table class="table table-bordered table-striped">
				<thead>
					<tr>
						<td>id</td>
						<th>Village</th>		
						</tr>
				</thead>
				<tbody>
				<c:forEach items="${listeVillage}" var="v">
                          <tr>
                          	<td><c:out value="${v.id}"/></td>
                              <td><c:out value="${v.nomVillage}"/></td>
                            
                          </tr>
                </c:forEach>
                </tbody>
				</table>
							
               <!-- Pie Chart -->
            <div class="col-xl-8 col-lg-5">
              <div class="card shadow mb-4">
                   <!-- Card Header - Dropdown -->
                <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                  <h6 class="m-0 font-weight-bold text-primary">Ajout Village</h6>
                  </div>
                   <!-- Card Body -->
                <div class="card-body">
                  	<form action="Village" method="post">
                  	
                  			<div class="form-group">
                  			   <label for="nomVillage">Village</label>
								<input name="nomVillage" type="text" class="form-control" />
							</div> 
							<div class="form-group">
							   <input class="btn btn-success" type="submit" name="Envoyer"/>
                            </div>
						</form>	         
				</div>
              </div>
            </div>
          </div>

<jsp:include page="../../footer.jsp"></jsp:include>
          