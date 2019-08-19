@TodoslosCasos
Feature: Buscar la palabra pruebaz en Google
	y corregir la busqueda

	@CasoExitoso
	Scenario: Buscar la palabra pruebaz en Google
		Given Abro el navegador
		When ingreso la palabra pruebaz en el buscador
		And selecciono la sugerencia de busqueda del buscador
		Then se valida que la cantidad de resultados sea mayor a lo especificado