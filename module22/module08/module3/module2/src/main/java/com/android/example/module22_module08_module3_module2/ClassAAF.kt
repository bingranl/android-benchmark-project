package com.android.example.module22_module08_module3_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: com.android.example.module22_module08_module3_module3.ClassAAA = com.android.example.module22_module08_module3_module3.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module22_module08_module3_module1.ClassAAD = com.android.example.module22_module08_module3_module1.ClassAAD()
	private 	val instance_var_1_2: com.android.example.module06_module313_module5.ClassAAB = com.android.example.module06_module313_module5.ClassAAB()

	fun method0(
		param0: com.android.example.module22_module08_module3_module1.ClassAAA
	) {
		val local_var_2_1: okio.Throttler = okio.Throttler()
		local_var_2_1.bytesPerSecond(-6495327979900686257, -7899395548887304713, -3646625330456835243)

		param0.method1(com.android.example.module22_module08_module3_module3.ClassAAD(), com.android.example.module22_module08_module3_module3.ClassAAE())

		listOf("1", "2", "3").forEach {
			param0.method0(com.android.example.module22_module08_module3_module3.ClassAAD())

		}
		val local_var_2_2: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
		local_var_2_2.deadlineNanoTime()

	}

	fun method1(
		param0: com.android.example.module22_module08_module3_module3.ClassAAD
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.onError(kotlin.Throwable())

		val local_var_2_2: okio.Throttler = okio.Throttler()
		local_var_2_2.bytesPerSecond(-7550529522168698201, -4050171462388945908, 513271498626883111)

		val local_var_2_3: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_3.dispose()

		param0.method1("SomeString", "SomeString", "SomeString")

	}

	fun method2(
		param0: com.android.example.module22_module08_module3_module3.ClassAAG,
		param1: com.android.example.module22_module08_module3_module1.ClassAAF,
		param2: com.android.example.module22_module08_module3_module1.ClassAAF,
		param3: com.android.example.module06_module313_module5.ClassAAA
	) {
		param0.method0("SomeString", "SomeString")

	}

	fun method3(
		param0: com.android.example.module06_module313_module5.ClassAAF,
		param1: com.android.example.module22_module08_module3_module3.ClassAAH,
		param2: com.android.example.module22_module08_module3_module1.ClassAAD,
		param3: com.android.example.module22_module08_module3_module1.ClassAAA
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.hasSubscription()

		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}
}
