package com.android.example.module06_module147_module4_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: com.android.example.module06_module147_module4_module6.ClassAAE = com.android.example.module06_module147_module4_module6.ClassAAE()
	private 	val instance_var_1_1: com.android.example.module06_module109_module1.ClassAAF = com.android.example.module06_module109_module1.ClassAAF()

	fun method0(
		param0: com.android.example.module06_module147_module4_module6.ClassAAA,
		param1: com.android.example.module06_module147_module4_module6.ClassAAF,
		param2: com.android.example.module06_module147_module4_module6.ClassAAH
	) {
		val local_var_2_3: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
		local_var_2_3.shutdown()

	}

	fun method1(
		param0: com.android.example.module06_module147_module4_module6.ClassAAJ,
		param1: com.android.example.module06_module147_module4_module6.ClassAAJ,
		param2: com.android.example.module06_module147_module4_module6.ClassAAE,
		param3: com.android.example.module06_module147_module4_module6.ClassAAC
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.schedulers.TestScheduler())

		}
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.isDisposed()

		val local_var_2_5: io.reactivex.internal.util.AppendOnlyLinkedArrayList<kotlin.Any> = io.reactivex.internal.util.AppendOnlyLinkedArrayList(95)
		local_var_2_5.add(kotlin.Any())

	}

	fun method2(
		param0: com.android.example.module06_module147_module4_module6.ClassAAH,
		param1: com.android.example.module06_module147_module4_module6.ClassAAI
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onError(kotlin.Throwable())

	}

	fun method3(
		param0: com.android.example.module06_module109_module1.ClassAAH,
		param1: com.android.example.module06_module147_module4_module6.ClassAAA,
		param2: com.android.example.module06_module109_module1.ClassAAG
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertSubscribed()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onNext(kotlin.Any())

	}
}
