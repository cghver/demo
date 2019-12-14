package com.tanghuachun.demo.controller;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONUtil;
import com.tanghuachun.demo.common.aop.validate.MyValid;
import com.tanghuachun.demo.common.response.PageResponse;
import com.tanghuachun.demo.entity.Company;
import com.tanghuachun.demo.request.FindWithConditionsRequest;
import com.tanghuachun.demo.service.CompanyService;
import lombok.extern.log4j.Log4j2;
import org.redisson.api.RedissonClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author darren
 */
@RestController
@RequestMapping("/company")
@Log4j2
public class CompanyController {

    @Resource
    private CompanyService companyService;
    @Resource
    private RedissonClient redissonClient;

    @PostMapping("/findWithConditions")
    @MyValid(returnPageResponseType = true)
    PageResponse findWithConditions(@RequestBody FindWithConditionsRequest request) {
        return companyService.findWithConditions(request);
    }

    public static void main(String[] args) {
        String str = "{\n" +
                "  \"code\": \"0000\",\n" +
                "  \"msg\": \"成功\",\n" +
                "  \"pageNo\": 1,\n" +
                "  \"pageSize\": 2,\n" +
                "  \"total\": 1092,\n" +
                "  \"totalPages\": 546,\n" +
                "  \"data\": [\n" +
                "    {\n" +
                "      \"acid\": 1,\n" +
                "      \"id\": \"913100005529249492\",\n" +
                "      \"name\": \"上海优创医疗器械技术股份有限公司\",\n" +
                "      \"logo\": \"https://253-assets.oss-cn-hangzhou.aliyuncs.com/albatross/images/201912091/adeb44bf906e40a7e6c1acf778369d43.jpg\",\n" +
                "      \"description\": \"优创医疗是一家由旅欧、旅美爱国华侨创办的有独立知识产权，由医学专家、高分子化学专家、织造工艺专家、医疗器械市场专家组成的专业医疗器械公司。优创医疗基本产业特点是集自主研发、生产和为全国及世界各地销售代理商提供技术支持为一体。经严格审核，公司已获得由上海市药品监督局、发改委和医保局分别颁发的医疗器械注册证、发改委物价以及医保收费代码。本公司与南京军区上海骨科中心医学临床合作课题被评为南京军区医学科技创新重点课题，经上海市科委公示：优创医疗获得2011年度国家科技创新基金。公司现阶段主要涉足的领域是临床骨科外固定。通过在德国和意大利进行的6年专业研究，公司研发出了创新性产品：随体塑形骨科外固定系统（包括刚性和韧性系列）。该产品经中国科学院上海分院评定为“国内领先，国际先进”。国内外骨科专家一致认为本公司的随体塑形骨科外固定系统是骨科外固定的理想模式，具有非常广阔的市场前景。优创医疗产品的逐步系列化和我们独具的知识产权专利簇，加上国内外丰富的市场资源，决定了本公司可长期持续发展，并在占有国内一定的市场份额后向国际市场拓展。\",\n" +
                "      \"phone\": \"-\",\n" +
                "      \"mail\": \"-\",\n" +
                "      \"website\": \"http://www.utrummedical.com\",\n" +
                "      \"industry\": \"科学研究和技术服务业\",\n" +
                "      \"address\": \"中国(上海)自由贸易试验区哈雷路998号4幢1楼101室\",\n" +
                "      \"type\": \"\",\n" +
                "      \"status\": \"存续,高新技术企业\",\n" +
                "      \"knowledgeZlNum\": 24,\n" +
                "      \"knowledgeSbNum\": 2,\n" +
                "      \"knowledgeZzqNum\": 0,\n" +
                "      \"knowledgeIcpNum\": 0,\n" +
                "      \"bdLongitude\": 121.611028000438,\n" +
                "      \"bdLatitude\": 31.200788862682,\n" +
                "      \"gdLongitude\": 121.604328,\n" +
                "      \"gdLatitude\": 31.194922,\n" +
                "      \"opLatest\": \"bd_insert\",\n" +
                "      \"remark\": \"bd_insert-大数据首次插入\",\n" +
                "      \"createUser\": \"bd\",\n" +
                "      \"createTime\": 1576219047,\n" +
                "      \"updateUser\": \"bd\",\n" +
                "      \"updateTime\": 0,\n" +
                "      \"isDeleted\": false\n" +
                "    },\n" +
                "    {\n" +
                "      \"acid\": 2,\n" +
                "      \"id\": \"913101175821016282\",\n" +
                "      \"name\": \"上海家健电子商务有限公司\",\n" +
                "      \"logo\": \"https://253-assets.oss-cn-hangzhou.aliyuncs.com/albatross/images/201912101/fe60436cfd899841d862760d70a35795.jpg\",\n" +
                "      \"description\": \"家健商城是一家专门做进口商品的网站，隶属于上海家健电子商务有限公司。\",\n" +
                "      \"phone\": \"021-64282848\",\n" +
                "      \"mail\": \"liuhuzheng@jajn.com\",\n" +
                "      \"website\": \"http://www.jajn.com\",\n" +
                "      \"industry\": \"批发和零售业\",\n" +
                "      \"address\": \"上海市松江区九亭镇中心路1158号1幢101室-15\",\n" +
                "      \"type\": \"\",\n" +
                "      \"status\": \"存续\",\n" +
                "      \"knowledgeZlNum\": 0,\n" +
                "      \"knowledgeSbNum\": 4,\n" +
                "      \"knowledgeZzqNum\": 0,\n" +
                "      \"knowledgeIcpNum\": 1,\n" +
                "      \"bdLongitude\": 121.336009049387,\n" +
                "      \"bdLatitude\": 31.10906951498,\n" +
                "      \"gdLongitude\": 121.329654,\n" +
                "      \"gdLatitude\": 31.102745,\n" +
                "      \"opLatest\": \"bd_insert\",\n" +
                "      \"remark\": \"bd_insert-大数据首次插入\",\n" +
                "      \"createUser\": \"bd\",\n" +
                "      \"createTime\": 1576219047,\n" +
                "      \"updateUser\": \"bd\",\n" +
                "      \"updateTime\": 0,\n" +
                "      \"isDeleted\": false\n" +
                "    }\n" +
                "  ]\n" +
                "}\n";
    }
}
