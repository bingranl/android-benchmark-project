package com.android.example.module06_module083_module06

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: com.android.example.module06_module083_module09.ClassAAB = com.android.example.module06_module083_module09.ClassAAB()
	private 	val instance_var_1_1: com.android.example.module06_module083_module09.ClassAAE = com.android.example.module06_module083_module09.ClassAAE()
	private 	val instance_var_1_2: com.android.example.module06_module109_module1.ClassAAH = com.android.example.module06_module109_module1.ClassAAH()

	fun method0(
		param0: com.android.example.module06_module109_module1.ClassAAE,
		param1: com.android.example.module06_module109_module1.ClassAAC,
		param2: com.android.example.module06_module109_module1.ClassAAG,
		param3: com.android.example.module06_module321_module10.ClassAAD
	) {
	}

	fun method1(
		param0: com.android.example.module06_module109_module1.ClassAAG,
		param1: com.android.example.module06_module321_module10.ClassAAB
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onComplete()

		for (iAb in 0..3) {
			listOf("1", "2", "3").forEach {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.onNext(kotlin.Any())

			}
			val local_var_3_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
			local_var_3_0.clear()

			val local_var_3_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_1.onNext(kotlin.Any())

			val local_var_3_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_2.request(-3931988229703080878)

		}
		val local_var_2_3: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_3.dispose()

	}
}
