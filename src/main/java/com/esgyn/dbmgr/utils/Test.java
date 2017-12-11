package com.esgyn.dbmgr.utils;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class Test {

	public static void main(String[] args){
		String result = "Environment Discover ***************************************************************Time Cost: 0 hour(s) 0 minute(s) 10 second(s)********************  Discover results********************[{'hostname': {'doc': 'Short hostname', 'value': 'esgsh-dev-xulei-1'}, 'user_disk_free': {'status': 'error', 'doc': 'Free data File System spaces', 'value': '0GB', 'expected': '1000GB'}, 'hadoop_auth': {'doc': 'Hadoop authentication', 'value': 'simple'}, 'pid_max': {'status': 'ok', 'doc': 'Kernel pid max', 'value': '65535'}, 'mem_total': {'status': 'error', 'doc': 'Total memory size', 'value': '16GB', 'expected': '64GB'}, 'ssh_pam': {'status': 'ok', 'doc': 'SSH PAM settings', 'value': 'Set'}, 'timezone': {'doc': 'System timezone', 'consistent': 'true', 'value': 'UTC'}, 'ntp_status': {'status': 'ok', 'doc': 'Ntp service status', 'value': 'Running'}, 'cpu_arch': {'status': 'ok', 'doc': 'CPU architecture', 'value': 'x86_64'}, 'loopback': {'status': 'ok', 'doc': 'Localhost setting in /etc/hosts', 'value': 'Set'}, 'tcp_probes': {'status': 'warn', 'doc': 'Kernel tcp keep alive probes', 'value': '9', 'expected': '4'}, 'home_dir': {'doc': 'Trafodion home directory', 'value': '/home'}, 'cpu_cores': {'status': 'ok', 'doc': 'CPU cores', 'value': '4'}, 'kernel_ver': {'doc': 'Linux Kernel', 'consistent': 'true', 'value': '2.6.32-573.3.1.el6.x86_64'}, 'net_interface': {'doc': 'Network interfaces', 'value': 'eth0'}, 'hive_ver': {'status': 'ok', 'doc': 'Hive version', 'value': '1.1'}, 'home_nfs': {'status': 'ok', 'doc': 'NFS on /home', 'value': 'Not mounted'}, 'install_disk_free': {'status': 'error', 'doc': 'Free System spaces', 'value': '2GB', 'expected': '200GB'}, 'hadoop_group_mapping': {'doc': 'Hadoop security group mapping', 'value': 'SHELL'}, 'ext_interface': {'doc': 'External network interface', 'consistent': 'true', 'value': 'eth0'}, 'sudo': {'status': 'ok', 'doc': 'Sudo access', 'value': 'Set'}, 'hadoop_distro': {'doc': 'Hadoop distro', 'value': 'CM5.7.6'}, 'net_bw': {'status': 'error', 'doc': 'Network Card bandwidth', 'value': 'N/A', 'expected': '10Gbps'}, 'systime': {'doc': 'Current system time', 'consistent': 'true', 'value': '2017-09-22 06:50:13'}, 'network_mgr_status': {'status': 'ok', 'doc': 'NetworkManager service status', 'value': 'Not running'}, 'core_pattern': {'doc': 'System Core pattern setting', 'value': 'core'}, 'dependencies': {'doc': 'EsgynDB RPM dependencies', 'value': {'pdsh': '2.26-4.el6.x86_64', 'sqlite': '3.6.20-1.el6_7.2.x86_64', 'unzip': '6.0-5.el6.x86_64', 'protobuf': '2.3.0-9.el6.x86_64', 'gnuplot': '4.2.6-2.el6.x86_64', 'apr': '1.3.9-5.el6_2.x86_64', 'lzop': '1.02-0.9.rc1.el6.x86_64', 'lzo': '2.03-3.1.el6_5.1.x86_64', 'libiodbc-devel': '3.52.7-1.el6.x86_64', 'apr-util': '1.3.9-3.el6_0.1.x86_64', 'snappy': '1.1.0-1.el6.x86_64', 'perl-Params-Validate': '0.92-3.el6.x86_64', 'perl-Time-HiRes': '1.9721-144.el6.x86_64', 'gzip': '1.3.12-22.el6.x86_64', 'perl-DBD-SQLite': '1.27-3.el6.x86_64', 'unixODBC-devel': '2.2.14-14.el6.x86_64', 'expect': '5.44.1.15-5.el6_4.x86_64'}}, 'license_status': {'status': 'error', 'doc': 'license status', 'value': 'NA'}, 'default_java': {'status': 'error', 'doc': 'Default java version', 'value': 'N/A'}, 'disk_nums': {'status': 'warn', 'doc': 'Disk numbers', 'value': '2', 'expected': '4'}, 'firewall_status': {'status': 'ok', 'doc': 'Firewall status', 'value': 'Stopped'}, 'swap_pct': {'status': 'error', 'doc': 'Swap/Mem percentage', 'value': '0%', 'expected': '25%'}, 'python_ver': {'doc': 'Python version', 'value': '2.6.6'}, 'tcp_time': {'status': 'warn', 'doc': 'Kernel tcp keep alive time', 'value': '7200', 'expected': '240'}, 'hbase_ver': {'status': 'ok', 'doc': 'HBase version', 'value': '1.2'}, 'tcp_intvl': {'status': 'warn', 'doc': 'Kernel tcp keep alive interval', 'value': '75', 'expected': '15'}, 'fqdn': {'status': 'ok', 'doc': 'FQDN', 'value': 'esgsh-dev-xulei-1.novalocal'}, 'linux_distro': {'status': 'ok', 'doc': 'Linux distro', 'value': 'centos6'}, 'mem_free': {'status': 'warn', 'doc': 'Current free memory size', 'value': '5GB', 'expected': '8GB'}, 'traf_status': {'status': 'warn', 'doc': 'Leftover Trafodion process', 'value': 'Running'}, 'hdfs_ver': {'status': 'ok', 'doc': 'HDFS version', 'value': '2.6'}}, {'hostname': {'doc': 'Short hostname', 'value': 'esgsh-dev-xulei-2'}, 'user_disk_free': {'status': 'error', 'doc': 'Free data File System spaces', 'value': '0GB', 'expected': '1000GB'}, 'hadoop_auth': {'doc': 'Hadoop authentication', 'value': 'simple'}, 'pid_max': {'status': 'ok', 'doc': 'Kernel pid max', 'value': '65535'}, 'mem_total': {'status': 'error', 'doc': 'Total memory size', 'value': '16GB', 'expected': '64GB'}, 'ssh_pam': {'status': 'ok', 'doc': 'SSH PAM settings', 'value': 'Set'}, 'timezone': {'doc': 'System timezone', 'consistent': 'true', 'value': 'UTC'}, 'ntp_status': {'status': 'ok', 'doc': 'Ntp service status', 'value': 'Running'}, 'cpu_arch': {'status': 'ok', 'doc': 'CPU architecture', 'value': 'x86_64'}, 'loopback': {'status': 'ok', 'doc': 'Localhost setting in /etc/hosts', 'value': 'Set'}, 'tcp_probes': {'status': 'warn', 'doc': 'Kernel tcp keep alive probes', 'value': '9', 'expected': '4'}, 'home_dir': {'doc': 'Trafodion home directory', 'value': '/home'}, 'cpu_cores': {'status': 'ok', 'doc': 'CPU cores', 'value': '4'}, 'kernel_ver': {'doc': 'Linux Kernel', 'consistent': 'true', 'value': '2.6.32-573.3.1.el6.x86_64'}, 'net_interfaces': {'doc': 'Network interfaces', 'value': 'eth0'}, 'hive_ver': {'status': 'ok', 'doc': 'Hive version', 'value': '1.1'}, 'home_nfs': {'status': 'ok', 'doc': 'NFS on /home', 'value': 'Not mounted'}, 'install_disk_free': {'status': 'error', 'doc': 'Free System spaces', 'value': '21GB', 'expected': '200GB'}, 'hadoop_group_mapping': {'doc': 'Hadoop security group mapping', 'value': 'SHELL'}, 'ext_interface': {'doc': 'External network interface', 'consistent': 'true', 'value': 'eth0'}, 'sudo': {'status': 'ok', 'doc': 'Sudo access', 'value': 'Set'}, 'hadoop_distro': {'doc': 'Hadoop distro', 'value': 'CM5.7.6'}, 'net_bw': {'status': 'error', 'doc': 'Network Card bandwidth', 'value': 'N/A', 'expected': '10Gbps'}, 'systime': {'doc': 'Current system time', 'consistent': 'true', 'value': '2017-09-22 06:50:11'}, 'network_mgr_status': {'status': 'ok', 'doc': 'NetworkManager service status', 'value': 'Not running'}, 'core_pattern': {'doc': 'System Core pattern setting', 'value': 'core'}, 'dependencies': {'doc': 'EsgynDB RPM dependencies', 'value': {'pdsh': '2.26-4.el6.x86_64', 'sqlite': '3.6.20-1.el6_7.2.x86_64', 'unzip': '6.0-5.el6.x86_64', 'protobuf': '2.3.0-9.el6.x86_64', 'gnuplot': '4.2.6-2.el6.x86_64', 'apr': '1.3.9-5.el6_2.x86_64', 'perl-Time-HiRes': '1.9721-144.el6.x86_64', 'lzop': '1.02-0.9.rc1.el6.x86_64', 'libiodbc-devel': '3.52.7-1.el6.x86_64', 'apr-util': '1.3.9-3.el6_0.1.x86_64', 'snappy': '1.1.0-1.el6.x86_64', 'perl-Params-Validate': '0.92-3.el6.x86_64', 'lzo': '2.03-3.1.el6_5.1.x86_64', 'gzip': '1.3.12-22.el6.x86_64', 'perl-DBD-SQLite': '1.27-3.el6.x86_64', 'unixODBC-devel': '2.2.14-14.el6.x86_64', 'expect': '5.44.1.15-5.el6_4.x86_64'}}, 'license_status': {'status': 'error', 'doc': 'license status', 'value': 'NA'}, 'default_java': {'status': 'error', 'doc': 'Default java version', 'value': 'N/A'}, 'disk_nums': {'status': 'error', 'doc': 'Disk numbers', 'value': '1', 'expected': '4'}, 'firewall_status': {'status': 'ok', 'doc': 'Firewall status', 'value': 'Stopped'}, 'swap_pct': {'status': 'error', 'doc': 'Swap/Mem percentage', 'value': '0%', 'expected': '25%'}, 'python_ver': {'doc': 'Python version', 'value': '2.6.6'}, 'tcp_time': {'status': 'warn', 'doc': 'Kernel tcp keep alive time', 'value': '7200', 'expected': '240'}, 'hbase_ver': {'status': 'ok', 'doc': 'HBase version', 'value': '1.2'}, 'tcp_intvl': {'status': 'warn', 'doc': 'Kernel tcp keep alive interval', 'value': '75', 'expected': '15'}, 'fqdn': {'status': 'ok', 'doc': 'FQDN', 'value': 'esgsh-dev-xulei-2.novalocal'}, 'linux_distro': {'status': 'ok', 'doc': 'Linux distro', 'value': 'centos6'}, 'mem_free': {'status': 'ok', 'doc': 'Current free memory size', 'value': '10GB'}, 'traf_status': {'status': 'warn', 'doc': 'Leftover Trafodion process', 'value': 'Running'}, 'hdfs_ver': {'status': 'ok', 'doc': 'HDFS version', 'value': '2.6'}}]";
		Map<String, Object> errMap = sumDiscover(result.substring(result.indexOf("[")));
		int i = 0;
		JSONObject json = new JSONObject(errMap);
		System.out.println(json);
	}
	
	public static Map<String, Object> sumDiscover(String result){
		JSONArray jsonResult = JSONArray.parseArray(result);
		Map<String, Object> errMap = new HashMap<String, Object>();
		for (int i = 0; i < jsonResult.size(); i++) {
			JSONObject nodeMsg = jsonResult.getJSONObject(i);
			Map<String, Object> map = nodeMsg.getInnerMap();
			for (Object fieldObject : map.keySet()) {
				String hostName = String.valueOf(((JSONObject) map.get("hostname")).get("value"));
				Map<String, String> statusMap = new HashMap<String, String>();
				JSONObject jsonField = (JSONObject) map.get(fieldObject);
				for (String field : jsonField.keySet()) {
					if (field.equalsIgnoreCase(("hostname"))) {
						hostName = jsonField.getString(field);
					}
				}
				statusMap.put(hostName, jsonField.getString("value"));
				if (jsonField.containsKey("status") && jsonField.getString("status").equals("warn")) {
					if (errMap.containsKey(fieldObject.toString())) {
						DiscoverBean bean = (DiscoverBean)errMap.get(fieldObject.toString());
						bean.getNodeStatus().putAll(statusMap);
						errMap.put(fieldObject.toString(), bean);
					} else {
						errMap.put(fieldObject.toString(), new DiscoverBean(jsonField.getString("doc"), 1,
								String.valueOf(jsonField.getString("expected")), statusMap));
					}
				}
				if (jsonField.containsKey("status") && jsonField.getString("status").equals("error")) {
					if (errMap.containsKey(fieldObject.toString())) {
						DiscoverBean bean = (DiscoverBean)errMap.get(fieldObject.toString());
						bean.getNodeStatus().putAll(statusMap);
						 bean.setIntVal(2);
						errMap.put(fieldObject.toString(), bean);
					} else {
						errMap.put(fieldObject.toString(), new DiscoverBean(jsonField.getString("doc"), 2,
								String.valueOf(jsonField.getString("expected")), statusMap));
					}
				}
			}
		}
		return errMap;
	}

}