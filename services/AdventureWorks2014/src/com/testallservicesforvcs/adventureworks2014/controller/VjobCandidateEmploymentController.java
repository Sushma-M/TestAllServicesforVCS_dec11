/*Copyright (c) 2016-2017 vcstest4.com All Rights Reserved.
 This software is the confidential and proprietary information of vcstest4.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with vcstest4.com*/
package com.testallservicesforvcs.adventureworks2014.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.util.Map;

import org.joda.time.LocalDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import com.testallservicesforvcs.adventureworks2014.VjobCandidateEmployment;
import com.testallservicesforvcs.adventureworks2014.VjobCandidateEmploymentId;
import com.testallservicesforvcs.adventureworks2014.service.VjobCandidateEmploymentService;


/**
 * Controller object for domain model class VjobCandidateEmployment.
 * @see VjobCandidateEmployment
 */
@RestController("AdventureWorks2014.VjobCandidateEmploymentController")
@Api(value = "VjobCandidateEmploymentController", description = "Exposes APIs to work with VjobCandidateEmployment resource.")
@RequestMapping("/AdventureWorks2014/VjobCandidateEmployment")
public class VjobCandidateEmploymentController {

    private static final Logger LOGGER = LoggerFactory.getLogger(VjobCandidateEmploymentController.class);

    @Autowired
	@Qualifier("AdventureWorks2014.VjobCandidateEmploymentService")
	private VjobCandidateEmploymentService vjobCandidateEmploymentService;

	@ApiOperation(value = "Creates a new VjobCandidateEmployment instance.")
@RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
public VjobCandidateEmployment createVjobCandidateEmployment(@RequestBody VjobCandidateEmployment vjobCandidateEmployment) {
		LOGGER.debug("Create VjobCandidateEmployment with information: {}" , vjobCandidateEmployment);

		vjobCandidateEmployment = vjobCandidateEmploymentService.create(vjobCandidateEmployment);
		LOGGER.debug("Created VjobCandidateEmployment with information: {}" , vjobCandidateEmployment);

	    return vjobCandidateEmployment;
	}

@ApiOperation(value = "Returns the VjobCandidateEmployment instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public VjobCandidateEmployment getVjobCandidateEmployment(@RequestParam("jobCandidateId") Integer jobCandidateId,@RequestParam("emp_startDate") LocalDateTime emp_startDate,@RequestParam("emp_endDate") LocalDateTime emp_endDate,@RequestParam("emp_orgName") String emp_orgName,@RequestParam("emp_jobTitle") String emp_jobTitle,@RequestParam("emp_responsibility") String emp_responsibility,@RequestParam("emp_functionCategory") String emp_functionCategory,@RequestParam("emp_industryCategory") String emp_industryCategory,@RequestParam("emp_loc_countryRegion") String emp_loc_countryRegion,@RequestParam("emp_loc_state") String emp_loc_state,@RequestParam("emp_loc_city") String emp_loc_city) throws EntityNotFoundException {

        VjobCandidateEmploymentId vjobcandidateemploymentId = new VjobCandidateEmploymentId();
        vjobcandidateemploymentId.setJobCandidateId(jobCandidateId);
        vjobcandidateemploymentId.setEmp_startDate(emp_startDate);
        vjobcandidateemploymentId.setEmp_endDate(emp_endDate);
        vjobcandidateemploymentId.setEmp_orgName(emp_orgName);
        vjobcandidateemploymentId.setEmp_jobTitle(emp_jobTitle);
        vjobcandidateemploymentId.setEmp_responsibility(emp_responsibility);
        vjobcandidateemploymentId.setEmp_functionCategory(emp_functionCategory);
        vjobcandidateemploymentId.setEmp_industryCategory(emp_industryCategory);
        vjobcandidateemploymentId.setEmp_loc_countryRegion(emp_loc_countryRegion);
        vjobcandidateemploymentId.setEmp_loc_state(emp_loc_state);
        vjobcandidateemploymentId.setEmp_loc_city(emp_loc_city);

        LOGGER.debug("Getting VjobCandidateEmployment with id: {}" , vjobcandidateemploymentId);
        VjobCandidateEmployment vjobCandidateEmployment = vjobCandidateEmploymentService.getById(vjobcandidateemploymentId);
        LOGGER.debug("VjobCandidateEmployment details with id: {}" , vjobCandidateEmployment);

        return vjobCandidateEmployment;
    }



    @ApiOperation(value = "Updates the VjobCandidateEmployment instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public VjobCandidateEmployment editVjobCandidateEmployment(@RequestParam("jobCandidateId") Integer jobCandidateId,@RequestParam("emp_startDate") LocalDateTime emp_startDate,@RequestParam("emp_endDate") LocalDateTime emp_endDate,@RequestParam("emp_orgName") String emp_orgName,@RequestParam("emp_jobTitle") String emp_jobTitle,@RequestParam("emp_responsibility") String emp_responsibility,@RequestParam("emp_functionCategory") String emp_functionCategory,@RequestParam("emp_industryCategory") String emp_industryCategory,@RequestParam("emp_loc_countryRegion") String emp_loc_countryRegion,@RequestParam("emp_loc_state") String emp_loc_state,@RequestParam("emp_loc_city") String emp_loc_city, @RequestBody VjobCandidateEmployment vjobCandidateEmployment) throws EntityNotFoundException {

        vjobCandidateEmployment.setJobCandidateId(jobCandidateId);
        vjobCandidateEmployment.setEmp_startDate(emp_startDate);
        vjobCandidateEmployment.setEmp_endDate(emp_endDate);
        vjobCandidateEmployment.setEmp_orgName(emp_orgName);
        vjobCandidateEmployment.setEmp_jobTitle(emp_jobTitle);
        vjobCandidateEmployment.setEmp_responsibility(emp_responsibility);
        vjobCandidateEmployment.setEmp_functionCategory(emp_functionCategory);
        vjobCandidateEmployment.setEmp_industryCategory(emp_industryCategory);
        vjobCandidateEmployment.setEmp_loc_countryRegion(emp_loc_countryRegion);
        vjobCandidateEmployment.setEmp_loc_state(emp_loc_state);
        vjobCandidateEmployment.setEmp_loc_city(emp_loc_city);

        LOGGER.debug("VjobCandidateEmployment details with id is updated with: {}" , vjobCandidateEmployment);

        return vjobCandidateEmploymentService.update(vjobCandidateEmployment);
    }


    @ApiOperation(value = "Deletes the VjobCandidateEmployment instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteVjobCandidateEmployment(@RequestParam("jobCandidateId") Integer jobCandidateId,@RequestParam("emp_startDate") LocalDateTime emp_startDate,@RequestParam("emp_endDate") LocalDateTime emp_endDate,@RequestParam("emp_orgName") String emp_orgName,@RequestParam("emp_jobTitle") String emp_jobTitle,@RequestParam("emp_responsibility") String emp_responsibility,@RequestParam("emp_functionCategory") String emp_functionCategory,@RequestParam("emp_industryCategory") String emp_industryCategory,@RequestParam("emp_loc_countryRegion") String emp_loc_countryRegion,@RequestParam("emp_loc_state") String emp_loc_state,@RequestParam("emp_loc_city") String emp_loc_city) throws EntityNotFoundException {

        VjobCandidateEmploymentId vjobcandidateemploymentId = new VjobCandidateEmploymentId();
        vjobcandidateemploymentId.setJobCandidateId(jobCandidateId);
        vjobcandidateemploymentId.setEmp_startDate(emp_startDate);
        vjobcandidateemploymentId.setEmp_endDate(emp_endDate);
        vjobcandidateemploymentId.setEmp_orgName(emp_orgName);
        vjobcandidateemploymentId.setEmp_jobTitle(emp_jobTitle);
        vjobcandidateemploymentId.setEmp_responsibility(emp_responsibility);
        vjobcandidateemploymentId.setEmp_functionCategory(emp_functionCategory);
        vjobcandidateemploymentId.setEmp_industryCategory(emp_industryCategory);
        vjobcandidateemploymentId.setEmp_loc_countryRegion(emp_loc_countryRegion);
        vjobcandidateemploymentId.setEmp_loc_state(emp_loc_state);
        vjobcandidateemploymentId.setEmp_loc_city(emp_loc_city);

        LOGGER.debug("Deleting VjobCandidateEmployment with id: {}" , vjobcandidateemploymentId);
        VjobCandidateEmployment vjobCandidateEmployment = vjobCandidateEmploymentService.delete(vjobcandidateemploymentId);

        return vjobCandidateEmployment != null;
    }


    /**
     * @deprecated Use {@link #findVjobCandidateEmployments(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of VjobCandidateEmployment instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<VjobCandidateEmployment> searchVjobCandidateEmploymentsByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering VjobCandidateEmployments list");
        return vjobCandidateEmploymentService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of VjobCandidateEmployment instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<VjobCandidateEmployment> findVjobCandidateEmployments(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering VjobCandidateEmployments list");
        return vjobCandidateEmploymentService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of VjobCandidateEmployment instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<VjobCandidateEmployment> filterVjobCandidateEmployments(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering VjobCandidateEmployments list");
        return vjobCandidateEmploymentService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportVjobCandidateEmployments(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return vjobCandidateEmploymentService.export(exportType, query, pageable);
    }

	@ApiOperation(value = "Returns the total count of VjobCandidateEmployment instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countVjobCandidateEmployments( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting VjobCandidateEmployments");
		return vjobCandidateEmploymentService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getVjobCandidateEmploymentAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return vjobCandidateEmploymentService.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service VjobCandidateEmploymentService instance
	 */
	protected void setVjobCandidateEmploymentService(VjobCandidateEmploymentService service) {
		this.vjobCandidateEmploymentService = service;
	}

}

